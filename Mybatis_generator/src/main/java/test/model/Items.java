package test.model;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table items
 */
public class Items {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column items.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column items.item_no
     *
     * @mbg.generated
     */
    private String itemNo;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column items.id
     *
     * @return the value of items.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column items.id
     *
     * @param id the value for items.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column items.item_no
     *
     * @return the value of items.item_no
     *
     * @mbg.generated
     */
    public String getItemNo() {
        return itemNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column items.item_no
     *
     * @param itemNo the value for items.item_no
     *
     * @mbg.generated
     */
    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }
}