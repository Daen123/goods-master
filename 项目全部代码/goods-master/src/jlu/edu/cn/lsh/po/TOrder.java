package jlu.edu.cn.lsh.po;

import java.math.BigDecimal;

public class TOrder {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.oid
     *
     * @mbggenerated Wed Oct 10 15:13:11 CST 2018
     */
    private String oid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.ordertime
     *
     * @mbggenerated Wed Oct 10 15:13:11 CST 2018
     */
    private String ordertime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.total
     *
     * @mbggenerated Wed Oct 10 15:13:11 CST 2018
     */
    private BigDecimal total;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.status
     *
     * @mbggenerated Wed Oct 10 15:13:11 CST 2018
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.address
     *
     * @mbggenerated Wed Oct 10 15:13:11 CST 2018
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.uid
     *
     * @mbggenerated Wed Oct 10 15:13:11 CST 2018
     */
    private String uid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.oid
     *
     * @return the value of t_order.oid
     *
     * @mbggenerated Wed Oct 10 15:13:11 CST 2018
     */
    public String getOid() {
        return oid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.oid
     *
     * @param oid the value for t_order.oid
     *
     * @mbggenerated Wed Oct 10 15:13:11 CST 2018
     */
    public void setOid(String oid) {
        this.oid = oid == null ? null : oid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.ordertime
     *
     * @return the value of t_order.ordertime
     *
     * @mbggenerated Wed Oct 10 15:13:11 CST 2018
     */
    public String getOrdertime() {
        return ordertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.ordertime
     *
     * @param ordertime the value for t_order.ordertime
     *
     * @mbggenerated Wed Oct 10 15:13:11 CST 2018
     */
    public void setOrdertime(String ordertime) {
        this.ordertime = ordertime == null ? null : ordertime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.total
     *
     * @return the value of t_order.total
     *
     * @mbggenerated Wed Oct 10 15:13:11 CST 2018
     */
    public BigDecimal getTotal() {
        return total;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.total
     *
     * @param total the value for t_order.total
     *
     * @mbggenerated Wed Oct 10 15:13:11 CST 2018
     */
    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.status
     *
     * @return the value of t_order.status
     *
     * @mbggenerated Wed Oct 10 15:13:11 CST 2018
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.status
     *
     * @param status the value for t_order.status
     *
     * @mbggenerated Wed Oct 10 15:13:11 CST 2018
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.address
     *
     * @return the value of t_order.address
     *
     * @mbggenerated Wed Oct 10 15:13:11 CST 2018
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.address
     *
     * @param address the value for t_order.address
     *
     * @mbggenerated Wed Oct 10 15:13:11 CST 2018
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.uid
     *
     * @return the value of t_order.uid
     *
     * @mbggenerated Wed Oct 10 15:13:11 CST 2018
     */
    public String getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.uid
     *
     * @param uid the value for t_order.uid
     *
     * @mbggenerated Wed Oct 10 15:13:11 CST 2018
     */
    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }
}