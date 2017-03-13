package com.girl.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by hlwen on 2017/3/13.
 */
@Aspect
@Component
public class HttpAspect {
    @Before("execution(public * com.girl.controller.GirlController.*(..))")
    public void log(){

        System.out.println(11111111);
    }
}
