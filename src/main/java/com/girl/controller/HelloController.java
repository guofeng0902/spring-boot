package com.girl.controller;

import com.girl.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by hlwen on 2017/3/12.
 */

@Controller
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    private String say(){
        return girlProperties.getCupSize();
//        return "index";

    };

}
//@RestController
//public class HelloController {
//
//    @Value("${cupSize}")
//    private String cupSize;
//    @Value("${age}")
//    private Integer age;
//
////    @RequestMapping(value = "/hello",method = RequestMethod.GET);
//    @RequestMapping(value = "/hello",method = RequestMethod.GET)
//    private String say(){
//        return cupSize + age;
//
//    };
//
//}
