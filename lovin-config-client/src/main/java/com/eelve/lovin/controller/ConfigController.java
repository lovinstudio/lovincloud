package com.eelve.lovin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
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
@RefreshScope // 使用该注解的类，会在接到SpringCloud配置中心配置刷新的时候，自动将新的配置更新到该类对应的字段中。
public class ConfigController {

    @Value("${lovin.token}")
    private String token;
    @RequestMapping("/token")
    public String getToken() {
        return this.token;
    }

}
