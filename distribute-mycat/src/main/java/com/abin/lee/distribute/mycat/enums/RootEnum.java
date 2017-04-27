package com.abin.lee.distribute.mycat.enums;

/**
 * Created by abin on 2017/4/25 2017/4/25.
 * circular-reference
 * com.abin.lee.circular.main.enums
 */
public enum RootEnum {

    SUCCESS("SUCCESS"),
    FAILURE("FAILURE"),
    ;
    private String param;

    RootEnum(String param) {
        this.param = param;
    }
}
