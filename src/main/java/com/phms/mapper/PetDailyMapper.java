package com.phms.mapper;

import com.phms.pojo.PetDaily;
import com.phms.pojo.PetDailyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PetDailyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet_daily
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    long countByExample(PetDailyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet_daily
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    int deleteByExample(PetDailyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet_daily
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet_daily
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    int insert(PetDaily record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet_daily
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    int insertSelective(PetDaily record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet_daily
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    List<PetDaily> selectByExample(PetDailyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet_daily
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    PetDaily selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet_daily
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    int updateByExampleSelective(@Param("record") PetDaily record, @Param("example") PetDailyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet_daily
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    int updateByExample(@Param("record") PetDaily record, @Param("example") PetDailyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet_daily
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    int updateByPrimaryKeySelective(PetDaily record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pet_daily
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    int updateByPrimaryKey(PetDaily record);

    List<PetDaily> getAllByLimit(PetDaily po);

    int countAllByLimit(PetDaily po);
}