package test.mapper;

import java.util.List;
import test.model.Employees;

public interface EmployeesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employees
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer employeenumber);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employees
     *
     * @mbg.generated
     */
    int insert(Employees record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employees
     *
     * @mbg.generated
     */
    Employees selectByPrimaryKey(Integer employeenumber);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employees
     *
     * @mbg.generated
     */
    List<Employees> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employees
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Employees record);
}