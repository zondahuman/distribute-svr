package com.abin.lee.distribute.mycat.test;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

/**
 * Created by abin on 2017/5/11 2017/5/11.
 * distribute-svr
 * com.abin.lee.distribute.mycat.test
 */
public class IntegerTest {

    public static void main(String[] args) {
        String result = Integer.toString(10);
        System.out.println(result);
        System.out.println("1111");

    }


    @Test
    public void test(){
        List<Integer> list = Lists.newArrayList();
        for (int i = 0; i <5 ; i++) {
            list.add(i);
        }
        int baseTwo = 2;
        for (int temp : list) {
            Integer result = temp % baseTwo;
            System.out.println("baseTwo-----temp=" + temp + " ,result="+result);
        }
        System.out.println("--------------------------------------------------------");
        int baseFour = 4;
        for (int temp : list) {
            Integer result = temp % baseFour;
            System.out.println("baseFour-----temp==" + temp + " ,result="+result);
        }
    }



}
