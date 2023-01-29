package test.mapper;

import java.util.List;
import test.model.Offices;

public interface OfficesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table offices
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String officecode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table offices
     *
     * @mbg.generated
     */
    int insert(Offices record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table offices
     *
     * @mbg.generated
     */
    Offices selectByPrimaryKey(String officecode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table offices
     *
     * @mbg.generated
     */
    List<Offices> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table offices
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Offices record);
}