package com.girl.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


/**
 * Created by hlwen on 2017/3/13.
 */
@Aspect
@Component
public class HttpAspect {

    private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);

    @Pointcut("execution(public * com.girl.controller.GirlController.*(..))")
    public void log(){

    }
    @Before("log()")
    public void doBefore(){
//        System.out.println(11111111);
        logger.info("11111111111");
    }

    @After("log()")
    public void doAfter(){
        logger.info("2222222");
    }
}
