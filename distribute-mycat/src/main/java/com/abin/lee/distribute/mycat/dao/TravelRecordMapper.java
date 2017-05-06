package com.abin.lee.distribute.mycat.dao;

import com.abin.lee.distribute.mycat.model.TravelRecord;
import com.abin.lee.distribute.mycat.model.TravelRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TravelRecordMapper {
    int countByExample(TravelRecordExample example);

    int deleteByExample(TravelRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TravelRecord record);

    int insertSelective(TravelRecord record);

    List<TravelRecord> selectByExample(TravelRecordExample example);

    TravelRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TravelRecord record, @Param("example") TravelRecordExample example);

    int updateByExample(@Param("record") TravelRecord record, @Param("example") TravelRecordExample example);

    int updateByPrimaryKeySelective(TravelRecord record);

    int updateByPrimaryKey(TravelRecord record);
}