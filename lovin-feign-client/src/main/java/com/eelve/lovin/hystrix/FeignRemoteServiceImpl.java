package com.eelve.lovin.hystrix;

import com.eelve.lovin.service.FeignRemoteService;
import org.springframework.stereotype.Component;

/**
 * @ClassName FeignRemoteServiceImpl
 * @Description TDO
 * @Author zhao.zhilue
 * @Date 2019/8/15 17:31
 * @Version 1.0
 **/
@Component
public class FeignRemoteServiceImpl implements FeignRemoteService {
    @Override
    public String hello() {
        return "hystrix起作用了";
    }
}
