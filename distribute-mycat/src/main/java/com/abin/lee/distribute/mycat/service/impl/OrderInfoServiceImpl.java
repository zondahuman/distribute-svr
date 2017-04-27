package com.abin.lee.distribute.mycat.service.impl;

import com.abin.lee.distribute.mycat.dao.OrderInfoMapper;
import com.abin.lee.distribute.mycat.model.OrderInfo;
import com.abin.lee.distribute.mycat.service.OrderInfoService;
import com.abin.lee.distribute.mycat.vo.request.UserVo;
import org.apache.commons.beanutils.PropertyUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

/**
 * Created by abin on 2017/4/27 17:48.
 * distribute-svr
 * com.abin.lee.distribute.mycat.service.impl
 */
@Service
public class OrderInfoServiceImpl implements OrderInfoService {

    @Resource
    OrderInfoMapper orderInfoMapper;



    @Override
    public void insert(UserVo userVo) {
        OrderInfo orderInfo = new OrderInfo();
        try {
            PropertyUtils.copyProperties(orderInfo, userVo);
            orderInfo.setCreateTime(new Date());
            orderInfo.setUpdateTime(new Date());
            orderInfo.setVersion(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.orderInfoMapper.insert(orderInfo);
    }




}
