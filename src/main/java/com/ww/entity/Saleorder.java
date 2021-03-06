package com.ww.entity;

import java.io.Serializable;
import java.util.Date;

public class Saleorder implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column saleorder.salOrId
     *
     * @mbg.generated Tue Nov 26 14:04:46 CST 2019
     */
    private Integer salorid;

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column saleorder.userId
     *
     * @mbg.generated Tue Nov 26 14:04:46 CST 2019
     */
    private Integer userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column saleorder.ordDate
     *
     * @mbg.generated Tue Nov 26 14:04:46 CST 2019
     */
    private Date orddate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column saleorder.totalSum
     *
     * @mbg.generated Tue Nov 26 14:04:46 CST 2019
     */
    private Double totalsum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table saleorder
     *
     * @mbg.generated Tue Nov 26 14:04:46 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column saleorder.salOrId
     *
     * @return the value of saleorder.salOrId
     *
     * @mbg.generated Tue Nov 26 14:04:46 CST 2019
     */
    public Integer getSalorid() {
        return salorid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column saleorder.salOrId
     *
     * @param salorid the value for saleorder.salOrId
     *
     * @mbg.generated Tue Nov 26 14:04:46 CST 2019
     */
    public void setSalorid(Integer salorid) {
        this.salorid = salorid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column saleorder.userId
     *
     * @return the value of saleorder.userId
     *
     * @mbg.generated Tue Nov 26 14:04:46 CST 2019
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column saleorder.userId
     *
     * @param userid the value for saleorder.userId
     *
     * @mbg.generated Tue Nov 26 14:04:46 CST 2019
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getOrddate() {
        return orddate;
    }

    public void setOrddate(Date orddate) {
        this.orddate = orddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column saleorder.totalSum
     *
     * @return the value of saleorder.totalSum
     *
     * @mbg.generated Tue Nov 26 14:04:46 CST 2019
     */
    public Double getTotalsum() {
        return totalsum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column saleorder.totalSum
     *
     * @param totalsum the value for saleorder.totalSum
     *
     * @mbg.generated Tue Nov 26 14:04:46 CST 2019
     */
    public void setTotalsum(Double totalsum) {
        this.totalsum = totalsum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table saleorder
     *
     * @mbg.generated Tue Nov 26 14:04:46 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", salorid=").append(salorid);
        sb.append(", userid=").append(userid);
        sb.append(", orddate=").append(orddate);
        sb.append(", totalsum=").append(totalsum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}