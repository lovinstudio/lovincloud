package com.eelve.lovin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ConfigController
 * @Description TDO
 * @Author zhao.zhilue
 * @Date 2019/8/20 17:17
 * @Version 1.0
 **/
@RestController
public class ConfigController {

    @Value("${lovin.token}")
    private String token;
    @RequestMapping("/token")
    public String getToken() {
        return this.token;
    }

}
