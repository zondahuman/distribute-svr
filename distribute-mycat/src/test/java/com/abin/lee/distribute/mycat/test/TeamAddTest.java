package com.abin.lee.distribute.mycat.test;

import com.abin.lee.distribute.common.util.JsonUtil;
import com.abin.lee.distribute.common.util.RestTemplateUtil;
import com.abin.lee.distribute.mycat.vo.request.TeamVo;
import com.abin.lee.distribute.mycat.vo.request.UserVo;
import com.google.common.collect.Maps;
import org.junit.Test;

import java.util.Map;

/**
 * Created by abin on 2017/4/25 2017/4/25.
 * circular-reference
 * com.abin.lee.circular.main.test
 */
public class TeamAddTest {
//    private static String httpUrl = "http://localhost:8300/orderInfo/call";;
    private static String httpUrl = "http://localhost:7100/team/call";


    @Test
    public void testTeamAdd1(){
        TeamVo teamVo = new TeamVo();
        teamVo.setTeamName("abin4");
        String json = JsonUtil.toJson(teamVo);
        Map<String, String> headers = Maps.newHashMap();
        headers.put("STATUS_INPUT", "what");
        String result = RestTemplateUtil.getInstance().httpPost(httpUrl,json, headers);
        System.out.println("result="+result);
    }

    @Test
    public void testTeamAdd2(){
        TeamVo teamVo = new TeamVo();
        teamVo.setTeamName("abin");
        String json = JsonUtil.toJson(teamVo);
        String result = RestTemplateUtil.getInstance().httpPost(httpUrl,json);
        System.out.println("result="+result);
    }


}
