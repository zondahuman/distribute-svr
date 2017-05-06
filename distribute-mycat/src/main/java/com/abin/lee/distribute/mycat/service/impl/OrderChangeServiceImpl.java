package com.abin.lee.distribute.mycat.service.impl;

import com.abin.lee.distribute.mycat.dao.CompanyMapper;
import com.abin.lee.distribute.mycat.dao.OrderChangeMapper;
import com.abin.lee.distribute.mycat.model.Company;
import com.abin.lee.distribute.mycat.model.OrderChange;
import com.abin.lee.distribute.mycat.service.CompanyService;
import com.abin.lee.distribute.mycat.service.OrderChangeService;
import com.abin.lee.distribute.mycat.vo.request.CompanyVo;
import com.abin.lee.distribute.mycat.vo.request.OrderChangeVo;
import org.apache.commons.beanutils.PropertyUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by abin on 2017/4/27 17:48.
 * distribute-svr
 * com.abin.lee.distribute.mycat.service.impl
 */
@Service
public class OrderChangeServiceImpl implements OrderChangeService {

    @Resource
    OrderChangeMapper orderChangeMapper;



    @Override
    public void insert(OrderChangeVo orderChangeVo) {
        OrderChange orderChange = new OrderChange();
        try {
            PropertyUtils.copyProperties(orderChange, orderChangeVo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.orderChangeMapper.insert(orderChange);
    }




}
