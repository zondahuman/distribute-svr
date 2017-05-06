package com.abin.lee.distribute.mycat.service.impl;

import com.abin.lee.distribute.mycat.dao.CompanyMapper;
import com.abin.lee.distribute.mycat.dao.OrderInfoMapper;
import com.abin.lee.distribute.mycat.model.Company;
import com.abin.lee.distribute.mycat.model.OrderInfo;
import com.abin.lee.distribute.mycat.service.CompanyService;
import com.abin.lee.distribute.mycat.service.OrderInfoService;
import com.abin.lee.distribute.mycat.vo.request.CompanyVo;
import com.abin.lee.distribute.mycat.vo.request.UserVo;
import org.apache.commons.beanutils.PropertyUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by abin on 2017/4/27 17:48.
 * distribute-svr
 * com.abin.lee.distribute.mycat.service.impl
 */
@Service
public class CompanyServiceImpl implements CompanyService {

    @Resource
    CompanyMapper companyMapper;



    @Override
    public void insert(CompanyVo companyVo) {
        Company company = new Company();
        try {
            PropertyUtils.copyProperties(company, companyVo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.companyMapper.insert(company);
    }




}
