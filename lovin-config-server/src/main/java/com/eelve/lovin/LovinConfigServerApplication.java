package com.eelve.lovin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
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
@EnableConfigServer
public class LovinConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(LovinConfigServerApplication.class,args);
    }
}
