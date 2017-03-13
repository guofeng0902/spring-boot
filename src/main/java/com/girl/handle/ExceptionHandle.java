package com.girl.handle;

import com.girl.domain.Result;
import com.girl.exception.GirlException;
import com.girl.utlis.ResultUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 异捕获再次封装放回同一错误提示
 * Created by hlwen on 2017/3/13.
 */
@ControllerAdvice
public class ExceptionHandle {
    @ExceptionHandler(value =  Exception.class)
    @ResponseBody
    public Result handle(Exception e){

        //处理异常
        if(e instanceof GirlException){//p判断是否自己定义的异常处理
            GirlException girlException = (GirlException) e;
            return ResultUtil.error(girlException.getCode(),girlException.getMessage());
        }else {
            return ResultUtil.error(-1,"未知错误");
        }
    }

}
