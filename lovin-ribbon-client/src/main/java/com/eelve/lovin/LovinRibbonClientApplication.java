package com.eelve.lovin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName LovinRibbonClientApplication
 * @Description TDO
 * @Author zhao.zhilue
 * @Date 2019/8/15 16:59
 * @Version 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class LovinRibbonClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(LovinRibbonClientApplication.class,args);
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
