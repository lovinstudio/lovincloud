package com.eelve.lovin.service;

import com.eelve.lovin.hystrix.FeignRemoteServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName FeignRemoteService
 * @Description TDO
 * @Author zhao.zhilue
 * @Date 2019/8/15 17:18
 * @Version 1.0
 **/
@FeignClient(value = "lovineurkaclient",fallback = FeignRemoteServiceImpl.class)
public interface FeignRemoteService {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello();
}
