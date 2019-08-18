package com.eelve.lovin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @ClassName LovinEurekaClientApplication
 * @Description TDO
 * @Author zhao.zhilue
 * @Date 2019/8/15 16:37
 * @Version 1.0
 **/
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class LovinCloudZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(LovinCloudZuulApplication.class,args);
    }
}
