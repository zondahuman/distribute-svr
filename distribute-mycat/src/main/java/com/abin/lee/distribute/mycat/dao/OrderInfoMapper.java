package com.abin.lee.distribute.mycat.dao;

import com.abin.lee.distribute.mycat.annotation.MybatisScan;
import com.abin.lee.distribute.mycat.model.OrderInfo;
import com.abin.lee.distribute.mycat.model.OrderInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@MybatisScan
public interface OrderInfoMapper {
    int countByExample(OrderInfoExample example);

    int deleteByExample(OrderInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderInfo record);

    int insertSelective(OrderInfo record);

    List<OrderInfo> selectByExample(OrderInfoExample example);

    OrderInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderInfo record, @Param("example") OrderInfoExample example);

    int updateByExample(@Param("record") OrderInfo record, @Param("example") OrderInfoExample example);

    int updateByPrimaryKeySelective(OrderInfo record);

    int updateByPrimaryKey(OrderInfo record);
}