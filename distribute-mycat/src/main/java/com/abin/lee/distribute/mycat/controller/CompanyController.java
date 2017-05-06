package com.abin.lee.distribute.mycat.controller;

import com.abin.lee.distribute.common.util.JsonUtil;
import com.abin.lee.distribute.mycat.service.CompanyService;
import com.abin.lee.distribute.mycat.vo.request.CompanyVo;
import com.abin.lee.distribute.mycat.vo.response.BaseVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by abin on 2017/4/27 17:48.
 * distribute-svr
 * com.abin.lee.distribute.mycat.controller
 */
@Controller
@RequestMapping("/company")
public class CompanyController {


    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Resource
    CompanyService companyService;

    @RequestMapping(value = "/call")
    @ResponseBody
    public BaseVo call(@RequestBody CompanyVo companyVo, HttpServletRequest request) {
        LOGGER.info("companyVo={}", JsonUtil.toJson(companyVo));
        String response = "FAILURE";
        String headers = request.getHeader("STATUS_INPUT");
        LOGGER.info("userVo={} headers={}", JsonUtil.toJson(companyVo), headers);
        try {
            this.companyService.insert(companyVo);
            LOGGER.info("response={}", response);
            response = "SUCCESS";
        } catch (Exception e) {
            LOGGER.error("companyVo={}", JsonUtil.toJson(companyVo), e);
            return BaseVo.error();
        }
        return BaseVo.success();
    }






}
