package com.ww.entity;

import java.io.Serializable;

public class Saldetail implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column saldetail.sDetailId
     *
     * @mbg.generated Tue Nov 26 14:04:46 CST 2019
     */
    private Integer sdetailid;

    private String gsname;

    private Integer price;

    public String getGsname() {
        return gsname;
    }

    public void setGsname(String gsname) {
        this.gsname = gsname;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column saldetail.salOrId
     *
     * @mbg.generated Tue Nov 26 14:04:46 CST 2019
     */
    private Integer salorid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column saldetail.gsId
     *
     * @mbg.generated Tue Nov 26 14:04:46 CST 2019
     */
    private Integer gsid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column saldetail.salNum
     *
     * @mbg.generated Tue Nov 26 14:04:46 CST 2019
     */
    private Integer salnum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table saldetail
     *
     * @mbg.generated Tue Nov 26 14:04:46 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column saldetail.sDetailId
     *
     * @return the value of saldetail.sDetailId
     *
     * @mbg.generated Tue Nov 26 14:04:46 CST 2019
     */
    public Integer getSdetailid() {
        return sdetailid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column saldetail.sDetailId
     *
     * @param sdetailid the value for saldetail.sDetailId
     *
     * @mbg.generated Tue Nov 26 14:04:46 CST 2019
     */
    public void setSdetailid(Integer sdetailid) {
        this.sdetailid = sdetailid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column saldetail.salOrId
     *
     * @return the value of saldetail.salOrId
     *
     * @mbg.generated Tue Nov 26 14:04:46 CST 2019
     */
    public Integer getSalorid() {
        return salorid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column saldetail.salOrId
     *
     * @param salorid the value for saldetail.salOrId
     *
     * @mbg.generated Tue Nov 26 14:04:46 CST 2019
     */
    public void setSalorid(Integer salorid) {
        this.salorid = salorid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column saldetail.gsId
     *
     * @return the value of saldetail.gsId
     *
     * @mbg.generated Tue Nov 26 14:04:46 CST 2019
     */
    public Integer getGsid() {
        return gsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column saldetail.gsId
     *
     * @param gsid the value for saldetail.gsId
     *
     * @mbg.generated Tue Nov 26 14:04:46 CST 2019
     */
    public void setGsid(Integer gsid) {
        this.gsid = gsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column saldetail.salNum
     *
     * @return the value of saldetail.salNum
     *
     * @mbg.generated Tue Nov 26 14:04:46 CST 2019
     */
    public Integer getSalnum() {
        return salnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column saldetail.salNum
     *
     * @param salnum the value for saldetail.salNum
     *
     * @mbg.generated Tue Nov 26 14:04:46 CST 2019
     */
    public void setSalnum(Integer salnum) {
        this.salnum = salnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table saldetail
     *
     * @mbg.generated Tue Nov 26 14:04:46 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sdetailid=").append(sdetailid);
        sb.append(", salorid=").append(salorid);
        sb.append(", gsid=").append(gsid);
        sb.append(", salnum=").append(salnum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}