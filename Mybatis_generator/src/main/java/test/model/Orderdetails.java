package test.model;

import java.math.BigDecimal;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table orderdetails
 */
public class Orderdetails {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderdetails.orderNumber
     *
     * @mbg.generated
     */
    private Integer ordernumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderdetails.productCode
     *
     * @mbg.generated
     */
    private String productcode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderdetails.quantityOrdered
     *
     * @mbg.generated
     */
    private Integer quantityordered;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderdetails.priceEach
     *
     * @mbg.generated
     */
    private BigDecimal priceeach;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderdetails.orderLineNumber
     *
     * @mbg.generated
     */
    private Short orderlinenumber;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderdetails.orderNumber
     *
     * @return the value of orderdetails.orderNumber
     *
     * @mbg.generated
     */
    public Integer getOrdernumber() {
        return ordernumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderdetails.orderNumber
     *
     * @param ordernumber the value for orderdetails.orderNumber
     *
     * @mbg.generated
     */
    public void setOrdernumber(Integer ordernumber) {
        this.ordernumber = ordernumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderdetails.productCode
     *
     * @return the value of orderdetails.productCode
     *
     * @mbg.generated
     */
    public String getProductcode() {
        return productcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderdetails.productCode
     *
     * @param productcode the value for orderdetails.productCode
     *
     * @mbg.generated
     */
    public void setProductcode(String productcode) {
        this.productcode = productcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderdetails.quantityOrdered
     *
     * @return the value of orderdetails.quantityOrdered
     *
     * @mbg.generated
     */
    public Integer getQuantityordered() {
        return quantityordered;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderdetails.quantityOrdered
     *
     * @param quantityordered the value for orderdetails.quantityOrdered
     *
     * @mbg.generated
     */
    public void setQuantityordered(Integer quantityordered) {
        this.quantityordered = quantityordered;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderdetails.priceEach
     *
     * @return the value of orderdetails.priceEach
     *
     * @mbg.generated
     */
    public BigDecimal getPriceeach() {
        return priceeach;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderdetails.priceEach
     *
     * @param priceeach the value for orderdetails.priceEach
     *
     * @mbg.generated
     */
    public void setPriceeach(BigDecimal priceeach) {
        this.priceeach = priceeach;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderdetails.orderLineNumber
     *
     * @return the value of orderdetails.orderLineNumber
     *
     * @mbg.generated
     */
    public Short getOrderlinenumber() {
        return orderlinenumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderdetails.orderLineNumber
     *
     * @param orderlinenumber the value for orderdetails.orderLineNumber
     *
     * @mbg.generated
     */
    public void setOrderlinenumber(Short orderlinenumber) {
        this.orderlinenumber = orderlinenumber;
    }
}