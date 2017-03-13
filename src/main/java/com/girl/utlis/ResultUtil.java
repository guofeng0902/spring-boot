package com.girl.utlis;

import com.girl.domain.Result;

/**
 * Created by hlwen on 2017/3/13.
 */
public class ResultUtil {
    /**
     * 成功
     * @param object
     * @return
     */
    public static Result success(Object object){
        Result result = new Result();
        result.setCode(0);
        result.setMsg("成功");
        result.setData(object);

        return result;
    }
    public static Result success(){
        return null;
    }

    /**
     * 失败
     * @param code
     * @param msg
     * @return
     */
    public static Result error(Integer code ,String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
