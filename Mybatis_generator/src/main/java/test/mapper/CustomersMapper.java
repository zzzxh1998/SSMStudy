package test.mapper;

import java.util.List;
import test.model.Customers;

public interface CustomersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customers
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer customernumber);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customers
     *
     * @mbg.generated
     */
    int insert(Customers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customers
     *
     * @mbg.generated
     */
    Customers selectByPrimaryKey(Integer customernumber);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customers
     *
     * @mbg.generated
     */
    List<Customers> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customers
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Customers record);
}