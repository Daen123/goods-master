package jlu.edu.cn.lsh.mapper;

import java.util.List;
import jlu.edu.cn.lsh.po.Category;
import jlu.edu.cn.lsh.po.CategoryExample;
import org.apache.ibatis.annotations.Param;

public interface CategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbggenerated Wed Oct 10 15:13:11 CST 2018
     */
    int countByExample(CategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbggenerated Wed Oct 10 15:13:11 CST 2018
     */
    int deleteByExample(CategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbggenerated Wed Oct 10 15:13:11 CST 2018
     */
    int deleteByPrimaryKey(String cid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbggenerated Wed Oct 10 15:13:11 CST 2018
     */
    int insert(Category record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbggenerated Wed Oct 10 15:13:11 CST 2018
     */
    int insertSelective(Category record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbggenerated Wed Oct 10 15:13:11 CST 2018
     */
    List<Category> selectByExample(CategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbggenerated Wed Oct 10 15:13:11 CST 2018
     */
    Category selectByPrimaryKey(String cid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbggenerated Wed Oct 10 15:13:11 CST 2018
     */
    int updateByExampleSelective(@Param("record") Category record, @Param("example") CategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbggenerated Wed Oct 10 15:13:11 CST 2018
     */
    int updateByExample(@Param("record") Category record, @Param("example") CategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbggenerated Wed Oct 10 15:13:11 CST 2018
     */
    int updateByPrimaryKeySelective(Category record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category
     *
     * @mbggenerated Wed Oct 10 15:13:11 CST 2018
     */
    int updateByPrimaryKey(Category record);
}