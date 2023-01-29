package test.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table payments
 */
public class Payments {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payments.customerNumber
     *
     * @mbg.generated
     */
    private Integer customernumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payments.checkNumber
     *
     * @mbg.generated
     */
    private String checknumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payments.paymentDate
     *
     * @mbg.generated
     */
    private Date paymentdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payments.amount
     *
     * @mbg.generated
     */
    private BigDecimal amount;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payments.customerNumber
     *
     * @return the value of payments.customerNumber
     *
     * @mbg.generated
     */
    public Integer getCustomernumber() {
        return customernumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payments.customerNumber
     *
     * @param customernumber the value for payments.customerNumber
     *
     * @mbg.generated
     */
    public void setCustomernumber(Integer customernumber) {
        this.customernumber = customernumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payments.checkNumber
     *
     * @return the value of payments.checkNumber
     *
     * @mbg.generated
     */
    public String getChecknumber() {
        return checknumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payments.checkNumber
     *
     * @param checknumber the value for payments.checkNumber
     *
     * @mbg.generated
     */
    public void setChecknumber(String checknumber) {
        this.checknumber = checknumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payments.paymentDate
     *
     * @return the value of payments.paymentDate
     *
     * @mbg.generated
     */
    public Date getPaymentdate() {
        return paymentdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payments.paymentDate
     *
     * @param paymentdate the value for payments.paymentDate
     *
     * @mbg.generated
     */
    public void setPaymentdate(Date paymentdate) {
        this.paymentdate = paymentdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payments.amount
     *
     * @return the value of payments.amount
     *
     * @mbg.generated
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payments.amount
     *
     * @param amount the value for payments.amount
     *
     * @mbg.generated
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}