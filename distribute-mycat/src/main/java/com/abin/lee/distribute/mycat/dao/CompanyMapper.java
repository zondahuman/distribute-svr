package com.abin.lee.distribute.mycat.dao;

import com.abin.lee.distribute.mycat.annotation.MybatisScan;
import com.abin.lee.distribute.mycat.model.Company;
import com.abin.lee.distribute.mycat.model.CompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

//@MybatisScan
public interface CompanyMapper {
    int countByExample(CompanyExample example);

    int deleteByExample(CompanyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Company record);

    int insertSelective(Company record);

    List<Company> selectByExample(CompanyExample example);

    Company selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Company record, @Param("example") CompanyExample example);

    int updateByExample(@Param("record") Company record, @Param("example") CompanyExample example);

    int updateByPrimaryKeySelective(Company record);

    int updateByPrimaryKey(Company record);
}