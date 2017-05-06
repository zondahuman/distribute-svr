package com.abin.lee.distribute.mycat.controller;

import com.abin.lee.distribute.common.util.JsonUtil;
import com.abin.lee.distribute.mycat.service.OrderInfoService;
import com.abin.lee.distribute.mycat.service.TeamService;
import com.abin.lee.distribute.mycat.vo.request.TeamVo;
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
@RequestMapping("/team")
public class TeamController {


    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Resource
    TeamService teamService;

    @RequestMapping(value = "/call")
    @ResponseBody
    public BaseVo call(@RequestBody TeamVo teamVo, HttpServletRequest request) {
        LOGGER.info("teamVo={}", JsonUtil.toJson(teamVo));
        String response = "FAILURE";
        String headers = request.getHeader("STATUS_INPUT");
        LOGGER.info("teamVo={} headers={}", JsonUtil.toJson(teamVo), headers);
        try {
            this.teamService.insert(teamVo);
            LOGGER.info("response={}", response);
            response = "SUCCESS";
        } catch (Exception e) {
            LOGGER.error("teamVo={}", JsonUtil.toJson(teamVo), e);
            return BaseVo.error();
        }
        return BaseVo.success();
    }






}
