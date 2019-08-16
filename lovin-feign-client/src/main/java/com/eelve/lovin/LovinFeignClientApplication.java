package com.eelve.lovin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName LovinFeignClientApplication
 * @Description TDO
 * @Author zhao.zhilue
 * @Date 2019/8/15 17:17
 * @Version 1.0
 **/
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@EnableHystrix
public class LovinFeignClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(LovinFeignClientApplication.class,args);
    }
}
