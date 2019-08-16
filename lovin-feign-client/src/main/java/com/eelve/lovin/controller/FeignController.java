package com.eelve.lovin.controller;

import com.eelve.lovin.service.FeignRemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName FeignController
 * @Description TDO
 * @Author zhao.zhilue
 * @Date 2019/8/15 17:21
 * @Version 1.0
 **/
@RestController
public class FeignController {

    @Autowired
    FeignRemoteService feignRemoteService;

    @GetMapping(value = "/getHello")
    public String getHello() {
        return feignRemoteService.hello();
    }
}
