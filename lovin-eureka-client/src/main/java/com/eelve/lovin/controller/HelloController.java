package com.eelve.lovin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description TDO应用默认访问接口
 * @Author zhao.zhilue
 * @Date 2019/8/15 16:45
 * @Version 1.0
 **/
@RestController
public class HelloController {

    @RequestMapping("hello")
    public String hello(){
        return HelloController.class.getName()+ "8802";
    }
}
