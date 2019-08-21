package com.eelve.lovin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName LovinEurekaClientApplication
 * @Description TDO
 * @Author zhao.zhilue
 * @Date 2019/8/15 16:37
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
public class LovinConfigClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(LovinConfigClientApplication.class,args);
    }
}
