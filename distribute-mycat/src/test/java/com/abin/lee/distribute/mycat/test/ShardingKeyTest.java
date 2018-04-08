package com.abin.lee.distribute.mycat.test;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

/**
 * Created by abin on 2017/5/11 2017/5/11.
 * distribute-svr
 * com.abin.lee.distribute.mycat.test
 */
public class ShardingKeyTest {

    public static void main(String[] args) {
        String result = Integer.toString(10);
        System.out.println(result);
        System.out.println("1111");

    }


    @Test
    public void testTwoFour(){
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

    /**
     * １、中间变量　＝ user_id%（库数量*每个库的表数量）;
     ２、库序号　＝　取整（中间变量／每个库的表数量）;
     ３、表序号　＝　中间变量％每个库的表数量;
     */
    @Test
    public void testShardingKey(){
        Integer dbCount = 2 ;
        Integer tableCount = 2 ;

        List<Integer> list = Lists.newArrayList();
        for (int i = 0; i <5 ; i++) {
            list.add(i);
        }
        int baseDbTwo = 2;
        int baseDbTwoTable = 4;

        for (int temp : list) {
            Integer middleTwo = temp % (baseDbTwo * baseDbTwoTable) ;
            Integer result = middleTwo / baseDbTwo;
            System.out.println("baseTwo-----db---------temp=" + temp + " ,result="+result);
        }
        System.out.println("--------------------------------------------------------");
        int baseDbFour = 4;
        int baseDbFourTable = 8;
        for (int temp : list) {
            Integer middleFour = temp % (baseDbFour * baseDbFourTable) ;
            Integer result = middleFour % baseDbFour;
            System.out.println("baseFour-----db---------temp==" + temp + " ,result="+result);
        }
    }


    @Test
    public void testTwo(){
        List<Integer> list = Lists.newArrayList();
        for (int i = 0; i <5 ; i++) {
            list.add(i);
        }
        int baseDatabase = 2;
        for (int temp : list) {
            Integer resultDatabase = temp % baseDatabase;
//            System.out.println("baseDatabase="+baseDatabase+" ,temp=" + temp + " ,resultDatabase="+resultDatabase);
            int baseTable = 2;
            Integer resultTable = temp % baseTable;
            System.out.println("baseDatabase="+baseDatabase + " ,temp=" + temp + " ,resultDatabase="+resultDatabase + " ,resultTable="+resultTable);
        }
        System.out.println("--------------------------------------------------------");

    }

    @Test
    public void testFour(){
        List<Integer> list = Lists.newArrayList();
        for (int i = 0; i <5 ; i++) {
            list.add(i);
        }
        int baseDatabase = 4;
        for (int temp : list) {
            Integer resultDatabase = temp % baseDatabase;
//            System.out.println("baseDatabase="+baseDatabase+" ,temp=" + temp + " ,resultDatabase="+resultDatabase);
            int baseTable = 4;
            Integer resultTable = temp % baseTable;
            System.out.println("baseDatabase="+baseDatabase + " ,temp=" + temp + " ,resultDatabase="+resultDatabase + " ,resultTable="+resultTable);
        }
        System.out.println("--------------------------------------------------------");
    }




    @Test
    public void testFourEight(){
        List<Integer> list1 = Lists.newArrayList();
        for (int i = 0; i <8 ; i++) {
            list1.add(i);
        }
        int baseDbFour = 4;
        for (int temp : list1) {
            Integer baseDbFourResult = temp % baseDbFour;
//            System.out.println("baseDbFour-----temp=" + temp + " ,baseDbFourResult="+baseDbFourResult);
            int baseTableTwo = 2;
            Integer baseDbFourTableTwoResult = (temp / baseDbFour) & (baseTableTwo - 1);
            System.out.println("baseDbFour-----temp==" + temp + " ,baseDbFourResult="+baseDbFourResult + " ,baseDbFourTableTwoResult="+baseDbFourTableTwoResult);
        }
        System.out.println("--------------------------------------------------------");


        int baseDbEight = 8;
        for (int temp : list1) {
            Integer baseDbEightResult = temp % baseDbEight;
//            System.out.println("baseDbEight-----temp=" + temp + " ,baseDbEightResult="+baseDbEightResult);
            int baseTableTwo = 2;
            Integer baseDbEightTableTwoResult = (temp / baseDbEightResult) & (baseTableTwo - 1);
            System.out.println("baseDbEightResult-----temp==" + temp + " ,baseDbEightResult="+baseDbEightResult + " ,baseDbEightTableTwoResult="+baseDbEightTableTwoResult);
        }
        System.out.println("--------------------------------------------------------");
    }




}
