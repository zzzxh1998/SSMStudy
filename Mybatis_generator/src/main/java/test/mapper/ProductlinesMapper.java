package test.mapper;

import java.util.List;
import test.model.Productlines;

public interface ProductlinesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productlines
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String productline);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productlines
     *
     * @mbg.generated
     */
    int insert(Productlines record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productlines
     *
     * @mbg.generated
     */
    Productlines selectByPrimaryKey(String productline);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productlines
     *
     * @mbg.generated
     */
    List<Productlines> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productlines
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Productlines record);
}