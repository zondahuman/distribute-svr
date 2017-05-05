package com.abin.lee.distribute.mycat.test;

import com.abin.lee.distribute.common.util.JsonUtil;
import com.abin.lee.distribute.common.util.RestTemplateUtil;
import com.abin.lee.distribute.mycat.vo.request.UserVo;
import com.google.common.collect.Maps;
import org.junit.Test;

import java.util.Map;

/**
 * Created by abin on 2017/4/25 2017/4/25.
 * circular-reference
 * com.abin.lee.circular.main.test
 */
public class OrderInfoAddTest {
    private static String httpUrl = "http://localhost:8300/orderInfo/call";;
//    private static String httpUrl = "http://localhost:7100/orderInfo/call";


    @Test
    public void testOrderInfoAdd1(){
        UserVo userVo = new UserVo();
        userVo.setName("abin");
        userVo.setAge(55);
        userVo.setId(1);
        String json = JsonUtil.toJson(userVo);
        Map<String, String> headers = Maps.newHashMap();
        headers.put("STATUS_INPUT", "what");
        String result = RestTemplateUtil.getInstance().httpPost(httpUrl,json, headers);
        System.out.println("result="+result);
    }

    @Test
    public void testOrderInfoAdd2(){
        UserVo userVo = new UserVo();
        userVo.setName("abin");
        userVo.setAge(55);
        userVo.setId(1);
        String json = JsonUtil.toJson(userVo);
        String result = RestTemplateUtil.getInstance().httpPost(httpUrl,json);
        System.out.println("result="+result);
    }


}
