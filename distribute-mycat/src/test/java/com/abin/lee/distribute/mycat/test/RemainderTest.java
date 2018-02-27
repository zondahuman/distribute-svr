package com.abin.lee.distribute.mycat.test;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

/**
 * Created by abin on 2018/2/23 21:37.
 * distribute-svr
 * com.abin.lee.distribute.mycat.test
 */
public class RemainderTest {
    public static void main(String[] args) {
        RemainderTest remainderTest = new RemainderTest();
        remainderTest.test();
        remainderTest.test1();
    }


    @Test
    public void test(){
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
    public void test1(){
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



}
