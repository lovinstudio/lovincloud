package com.eelve.lovin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName LovinEurekaServerApplication
 * @Description TDO
 * @Author zhao.zhilue
 * @Date 2019/8/15 16:20
 * @Version 1.0
 **/
@EnableEurekaServer
@SpringBootApplication
public class LovinEurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(LovinEurekaServerApplication.class,args);
    }
}
