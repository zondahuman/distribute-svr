package com.abin.lee.distribute.mycat.test;

import com.abin.lee.distribute.common.util.JsonUtil;
import com.abin.lee.distribute.common.util.RestTemplateUtil;
import com.abin.lee.distribute.mycat.vo.request.CompanyVo;
import com.abin.lee.distribute.mycat.vo.request.UserVo;
import com.google.common.collect.Maps;
import org.junit.Test;

import java.util.Map;

/**
 * Created by abin on 2017/4/25 2017/4/25.
 * circular-reference
 * com.abin.lee.circular.main.test
 */
public class CompanyAddTest {
//    private static String httpUrl = "http://localhost:8300/company/call";;
    private static String httpUrl = "http://localhost:7100/company/call";


    @Test
    public void testOrderInfoAdd1(){
        CompanyVo companyVo = new CompanyVo();
        companyVo.setName("abin");
        companyVo.setShardingId(55);
        String json = JsonUtil.toJson(companyVo);
        Map<String, String> headers = Maps.newHashMap();
        headers.put("STATUS_INPUT", "what");
        String result = RestTemplateUtil.getInstance().httpPost(httpUrl,json, headers);
        System.out.println("result="+result);
    }

    @Test
    public void testOrderInfoAdd2(){
        CompanyVo companyVo = new CompanyVo();
        companyVo.setName("abin");
        companyVo.setShardingId(55);
        String json = JsonUtil.toJson(companyVo);
        String result = RestTemplateUtil.getInstance().httpPost(httpUrl,json);
        System.out.println("result="+result);
    }


}
