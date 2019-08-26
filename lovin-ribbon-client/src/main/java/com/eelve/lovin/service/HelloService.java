package com.eelve.lovin.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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
    @HystrixCommand(fallbackMethod = "errorFallback",groupKey = "ribbonHello")
    public String getHello() {
        return restTemplate.getForObject("http://lovineurkaclient/hello",String.class);
    }


    public String errorFallback() {
        return "Error!";
    }
}
