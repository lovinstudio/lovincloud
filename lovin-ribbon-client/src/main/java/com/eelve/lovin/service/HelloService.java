package com.eelve.lovin.service;

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

    public String getHello() {
        return restTemplate.getForObject("http://lovineurkaclient/hello",String.class);
    }
}
