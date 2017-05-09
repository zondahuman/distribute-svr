package com.abin.lee.distribute.mycat.test;

import com.abin.lee.distribute.common.util.JsonUtil;
import com.abin.lee.distribute.common.util.RestTemplateUtil;
import com.abin.lee.distribute.mycat.vo.request.BusiTimestampVo;
import com.abin.lee.distribute.mycat.vo.request.TeamVo;
import com.google.common.collect.Maps;
import org.junit.Test;

import java.util.Map;

/**
 * Created by abin on 2017/4/25 2017/4/25.
 * circular-reference
 * com.abin.lee.circular.main.test
 */
public class BusiTimestampAddTest {
    private static String httpUrl = "http://localhost:8300/busi/call";;
//    private static String httpUrl = "http://localhost:7100/busi/call";


    @Test
    public void testBusiTimestampAdd1(){
        BusiTimestampVo busiTimestampVo = new BusiTimestampVo();
        busiTimestampVo.setName("abin5");
        busiTimestampVo.setAge(35);
        String json = JsonUtil.toJson(busiTimestampVo);
        Map<String, String> headers = Maps.newHashMap();
        headers.put("STATUS_INPUT", "what");
        String result = RestTemplateUtil.getInstance().httpPost(httpUrl,json, headers);
        System.out.println("result="+result);
    }

    @Test
    public void testBusiTimestampAdd2(){
        BusiTimestampVo busiTimestampVo = new BusiTimestampVo();
        busiTimestampVo.setName("abin5");
        busiTimestampVo.setAge(35);
        String json = JsonUtil.toJson(busiTimestampVo);
        String result = RestTemplateUtil.getInstance().httpPost(httpUrl,json);
        System.out.println("result="+result);
    }


}
