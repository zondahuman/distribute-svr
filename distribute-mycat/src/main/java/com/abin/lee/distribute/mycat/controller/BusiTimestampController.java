package com.abin.lee.distribute.mycat.controller;

import com.abin.lee.distribute.common.util.JsonUtil;
import com.abin.lee.distribute.mycat.service.BusiTimestampService;
import com.abin.lee.distribute.mycat.service.TeamService;
import com.abin.lee.distribute.mycat.vo.request.BusiTimestampVo;
import com.abin.lee.distribute.mycat.vo.request.TeamVo;
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
 * Created by abin on 2017/5/9 15:44.
 * distribute-svr
 * com.abin.lee.distribute.mycat.controller
 */
@Controller
@RequestMapping("/busi")
public class BusiTimestampController {


    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Resource
    BusiTimestampService busiTimestampService;

    @RequestMapping(value = "/call")
    @ResponseBody
    public BaseVo call(@RequestBody BusiTimestampVo busiTimestampVo, HttpServletRequest request) {
        LOGGER.info("busiTimestampVo={}", JsonUtil.toJson(busiTimestampVo));
        String headers = request.getHeader("STATUS_INPUT");
        LOGGER.info("busiTimestampVo={} headers={}", JsonUtil.toJson(busiTimestampVo), headers);
        try {
            this.busiTimestampService.insert(busiTimestampVo);
        } catch (Exception e) {
            LOGGER.error("busiTimestampVo={}", JsonUtil.toJson(busiTimestampVo), e);
            return BaseVo.error();
        }
        return BaseVo.success();
    }


}
