package com.eelve.lovin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName LovinRibbonClientApplication
 * @Description TDO
 * @Author zhao.zhilue
 * @Date 2019/8/15 16:59
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableAdminServer
public class LovinAdminServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LovinAdminServerApplication.class,args);
    }

}
