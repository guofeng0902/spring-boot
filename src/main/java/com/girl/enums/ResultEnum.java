package com.girl.enums;

/**
 * 枚举定义异常码
 * Created by hlwen on 2017/3/13.
 */
public enum ResultEnum {
    UNKONW_ERROR(-1,"未知错误"),
    SUCCESS(0,"成功"),
    PRIMARY_SCHOOL(100,"你可能上小学"),
    MIDDLE_SCHOOL(100,"你可能上小学"),
    ;

    private Integer code;

    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
