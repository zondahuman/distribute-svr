package com.abin.lee.distribute.mycat.service.impl;

import com.abin.lee.distribute.mycat.dao.BusiTimestampMapper;
import com.abin.lee.distribute.mycat.dao.OrderInfoMapper;
import com.abin.lee.distribute.mycat.model.BusiTimestamp;
import com.abin.lee.distribute.mycat.model.OrderInfo;
import com.abin.lee.distribute.mycat.service.BusiTimestampService;
import com.abin.lee.distribute.mycat.vo.request.BusiTimestampVo;
import org.apache.commons.beanutils.PropertyUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by abin on 2017/5/9 15:41.
 * distribute-svr
 * com.abin.lee.distribute.mycat.service.impl
 */
@Service
public class BusiTimestampServiceImpl implements BusiTimestampService {

    @Resource
    BusiTimestampMapper busiTimestampMapper;



    @Override
    public void insert(BusiTimestampVo busiTimestampVo) {
        BusiTimestamp busiTimestamp = new BusiTimestamp();
        try {
            PropertyUtils.copyProperties(busiTimestamp, busiTimestampVo);
            busiTimestamp.setVersion(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.busiTimestampMapper.insert(busiTimestamp);
    }
}
