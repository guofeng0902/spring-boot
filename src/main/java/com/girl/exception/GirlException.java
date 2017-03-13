package com.girl.exception;

import com.girl.enums.ResultEnum;

import java.util.ResourceBundle;

/**
 * Created by hlwen on 2017/3/13.
 */
public class GirlException extends RuntimeException{
    private Integer code;

    public GirlException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
