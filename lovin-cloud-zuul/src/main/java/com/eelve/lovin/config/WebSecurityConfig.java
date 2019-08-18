package com.eelve.lovin.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @ClassName WebSecurityConfig
 * @Description TDO
 * @Author zhao.zhilue
 * @Date 2019/8/18 12:17
 * @Version 1.0
 **/
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().anyRequest().permitAll()
                .and().csrf().disable();
    }
}
