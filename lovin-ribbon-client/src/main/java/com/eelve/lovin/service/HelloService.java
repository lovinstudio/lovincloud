package com.eelve.lovin.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName HelloService
 * @Description TDO
 * @Author zhao.zhilue
 * @Date 2019/8/15 17:02
 * @Version 1.0
 **/
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    /**
     * commandKey：依赖命名
     * CommandGroup：依赖分组
     * ThreadPoolKey：对线程池或信号量分组，虽然访问的依赖业务上都是同一个组，但是需要在资源上做隔离时，可使用ThreadPoolKey区分
     * @return
     */
    @HystrixCommand(fallbackMethod = "errorFallback",commandProperties = {
            //设置熔断
            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),
            //时间滚动中最小请求参数，只有在一个统计窗口内处理的请求数量达到这个阈值，才会进行熔断与否的判断
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),
            //休眠时间窗
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "20000"),
            //错误百分比，判断熔断的阈值，默认值50，表示在一个统计窗口内有50%的请求处理失败，会触发熔断
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "40")
    })
    public String getHello() {
        return restTemplate.getForObject("http://lovineurkaclient/hello",String.class);
    }


    public String errorFallback() {
        return "错误!";
    }
}
