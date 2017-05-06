package com.abin.lee.distribute.mycat.controller;

import com.abin.lee.distribute.common.util.JsonUtil;
import com.abin.lee.distribute.mycat.service.OrderChangeService;
import com.abin.lee.distribute.mycat.service.OrderInfoService;
import com.abin.lee.distribute.mycat.vo.request.OrderChangeVo;
import com.abin.lee.distribute.mycat.vo.request.UserVo;
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
@RequestMapping("/orderChange")
public class OrderChangeController {


    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Resource
    OrderChangeService orderChangeService;

    @RequestMapping(value = "/call")
    @ResponseBody
    public BaseVo call(@RequestBody OrderChangeVo orderChangeVo, HttpServletRequest request) {
        LOGGER.info("orderChangeVo={}", JsonUtil.toJson(orderChangeVo));
        String response = "FAILURE";
        String headers = request.getHeader("STATUS_INPUT");
        LOGGER.info("userVo={} headers={}", JsonUtil.toJson(orderChangeVo), headers);
        try {
            this.orderChangeService.insert(orderChangeVo);
            LOGGER.info("response={}", response);
            response = "SUCCESS";
        } catch (Exception e) {
            LOGGER.error("userVo={}", JsonUtil.toJson(orderChangeVo), e);
            return BaseVo.error();
        }
        return BaseVo.success();
    }






}
