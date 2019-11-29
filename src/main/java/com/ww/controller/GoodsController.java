package com.ww.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ww.entity.*;
import com.ww.mapper.GoodsMapper;
import com.ww.mapper.SaldetailMapper;
import com.ww.mapper.SaleorderMapper;
import com.ww.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin
public class GoodsController {

    @Autowired
    UserMapper userMapper;

    @Autowired
    SaldetailMapper saldetailMapper;

    @Autowired
    SaleorderMapper saleorderMapper;

    @Autowired
    GoodsMapper goodsMapper;

    @RequestMapping("login")
    public String login(String userId, String password, HttpServletRequest request){

        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUseridEqualTo(Integer.parseInt(userId));
        criteria.andPasswordEqualTo(password);
        List<User> users = userMapper.selectByExample(userExample);
        if(users!=null && users.size()>0){
            request.getSession().setAttribute("userId",users.get(0).getUserid());
            return "success";
        }
        return "error";
    }

    @RequestMapping("list")
    public PageInfo<Saleorder> list(@RequestParam(defaultValue = "0")Integer pageNum,@RequestParam(defaultValue = "3")Integer pageSize,HttpServletRequest request){

        PageHelper.startPage(pageNum,pageSize);
        int userId = (int) request.getSession().getAttribute("userId");

        SaleorderExample saleorderExample = new SaleorderExample();
        SaleorderExample.Criteria criteria = saleorderExample.createCriteria();
        criteria.andUseridEqualTo(userId);
        List<Saleorder> saleorders = saleorderMapper.selectByExample(saleorderExample);

        return new PageInfo<>(saleorders);
    }

    @RequestMapping("getSqlDetail")
    public List<Saldetail> getSqlDetail(String salorid){

        SaldetailExample saldetailExample = new SaldetailExample();
        SaldetailExample.Criteria criteria = saldetailExample.createCriteria();
        criteria.andSaloridEqualTo(Integer.parseInt(salorid));
        List<Saldetail> saldetails = saldetailMapper.selectByExample(saldetailExample);
        for (int i = 0; i < saldetails.size(); i++) {
            Saldetail saldetail = saldetails.get(i);

            Integer gsid = saldetail.getGsid();
            Goods goods = goodsMapper.selectByPrimaryKey(gsid);
            saldetail.setPrice(goods.getPrice());
            saldetail.setGsname(goods.getName());
        }
        return saldetails;
    }

    @RequestMapping("getGoods")
    public List<Goods> getGoods(String salorid){
        return goodsMapper.selectByExample(new GoodsExample());
    }

    @RequestMapping("getUser")
    public User getUser(HttpServletRequest request){
        int userid = (int) request.getSession().getAttribute("userId");
        return userMapper.selectByPrimaryKey(userid);
    }

    @RequestMapping("addDetail")
    @Transactional
    public String addDetail(String msg,HttpServletRequest request){

        int userid = (int) request.getSession().getAttribute("userId");

        //获取页面传过来的数据并移除最后一位逗号
        msg=msg.substring(0,msg.length()-1);
        //获取当前最大单号
        int salorid1 = saleorderMapper.max();

        //添加新订单
        Saleorder saleorder = new Saleorder();
        saleorder.setUserid(userid);
        saleorder.setOrddate(new Date());
        //订单号生成管理
        saleorder.setSalorid(salorid1+1);
        saleorderMapper.insertSelective(saleorder);

        //用户测试事务原子性，事物回滚
        //int ii=1/0;

        int salorid = saleorder.getSalorid();
        int totalSum1=0;
        //字符串切割拿到每一条数据
        String[] strs = msg.split(",");
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            System.out.println(str);
            String gsid = str.split("_")[0];
            String salnum = str.split("_")[1];

            //添加新明细单
            Saldetail saldetail = new Saldetail();
            saldetail.setSalnum(Integer.parseInt(salnum));
            saldetail.setSalorid(salorid);
            //销售明细单号生成管理
            saldetail.setSdetailid(salorid*100+i+1);
            saldetail.setGsid(Integer.parseInt(gsid));
            Goods goods = goodsMapper.selectByPrimaryKey(Integer.parseInt(gsid));
            saldetail.setPrice(goods.getPrice());
            //销售明细的金额小计计算
            int total = saldetail.getPrice()*saldetail.getSalnum();
            //订单总金额计算
            totalSum1=totalSum1+total;
            System.out.println(saldetail);
            //后台提交时进行查询，如果下单商品的数量大于库存，则事务回滚
            Goods goods1 = goodsMapper.selectByPrimaryKey(saldetail.getGsid());
            if(saldetail.getSalnum()>goods1.getInvtnum()){
                int ii = 1/0;
                return "kucun";
            }else{
                //下单商品数量不大于库存，则修改库存量程序继续运行
                goods1.setInvtnum(goods1.getInvtnum()-saldetail.getSalnum());
                goodsMapper.updateByPrimaryKeySelective(goods1);
                saldetailMapper.insertSelective(saldetail);
            }
        }
        //查询当前用户的积分
        User user = userMapper.selectByPrimaryKey(userid);

        //用户积分计算
        user.setInteg(user.getInteg()+totalSum1/10);
        userMapper.updateByPrimaryKeySelective(user);

        double totalSum = totalSum1;

        //订单总金额计算
        Saleorder saleorder1 = saleorderMapper.selectByPrimaryKey(salorid);
        //若当前用户积分大于1000，打九五折
        if(user.getInteg()>=1000){
            saleorder1.setTotalsum(totalSum*0.95);
        }else{
            saleorder1.setTotalsum(totalSum);
        }
        saleorderMapper.updateByPrimaryKeySelective(saleorder1);

        return "success";
    }
}
