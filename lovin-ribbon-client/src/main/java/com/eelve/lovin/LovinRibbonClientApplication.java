package com.eelve.lovin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName LovinRibbonClientApplication
 * @Description TDO
 * @Author zhao.zhilue
 * @Date 2019/8/15 16:59
 * @Version 1.0
 *
 * ===========================================
 * 增加熔断器，@EnableHystrix与@EnableCircuitBreaker
 * 区别：@EnableHystrix注解的作用和@EnableCircuitBreaker注解的作用一样
 *      ,@EnableHystrix注解对@EnableCircuitBreaker注解进行了封装
 **/
@SpringBootApplication
@EnableHystrix
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
