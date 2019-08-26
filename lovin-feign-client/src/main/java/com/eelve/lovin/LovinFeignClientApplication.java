package com.eelve.lovin;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

/**
 * @ClassName LovinFeignClientApplication
 * @Description TDO
 * @Author zhao.zhilue
 * @Date 2019/8/15 17:17
 * @Version 1.0
 * ===============================================
 * 其中@EnableFeignClients是默认启用了断路器功能，
 * 所以这里的启动类上不需要再加@EnableHystrix注解对@EnableCircuitBreaker注解
 * 但是断路器未开启，需要在配置中开启熔断器
 *
 *
 **/
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@EnableHystrix
@EnableHystrixDashboard
public class LovinFeignClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(LovinFeignClientApplication.class,args);
    }

    @Bean
    public ServletRegistrationBean getServlet(){
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
        registrationBean.setLoadOnStartup(1);
        registrationBean.addUrlMappings("/actuator/hystrix.stream");
        registrationBean.setName("HystrixMetricsStreamServlet");
        return registrationBean;
    }

}
