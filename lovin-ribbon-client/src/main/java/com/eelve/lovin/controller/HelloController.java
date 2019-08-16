package com.eelve.lovin.controller;

import com.eelve.lovin.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description TDO
 * @Author zhao.zhilue
 * @Date 2019/8/15 17:05
 * @Version 1.0
 **/
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping("hello")
    public String hello(){
        return helloService.getHello();
    }
}
