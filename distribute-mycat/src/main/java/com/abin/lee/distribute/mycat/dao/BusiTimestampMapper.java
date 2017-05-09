package com.abin.lee.distribute.mycat.dao;

import com.abin.lee.distribute.mycat.model.BusiTimestamp;
import com.abin.lee.distribute.mycat.model.BusiTimestampExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BusiTimestampMapper {
    int countByExample(BusiTimestampExample example);

    int deleteByExample(BusiTimestampExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BusiTimestamp record);

    int insertSelective(BusiTimestamp record);

    List<BusiTimestamp> selectByExample(BusiTimestampExample example);

    BusiTimestamp selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BusiTimestamp record, @Param("example") BusiTimestampExample example);

    int updateByExample(@Param("record") BusiTimestamp record, @Param("example") BusiTimestampExample example);

    int updateByPrimaryKeySelective(BusiTimestamp record);

    int updateByPrimaryKey(BusiTimestamp record);
}