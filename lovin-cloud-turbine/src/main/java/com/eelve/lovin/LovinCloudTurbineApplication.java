package com.eelve.lovin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;

/**
 * @ClassName LovinCloudTurbineApplication
 * @Description TDO
 * @Author zhao.zhilue
 * @Date 2019/8/25 17:17
 * @Version 1.0
 *
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableTurbine
@EnableTurbineStream
public class LovinCloudTurbineApplication {
    public static void main(String[] args) {
        SpringApplication.run(LovinCloudTurbineApplication.class,args);
    }


}
