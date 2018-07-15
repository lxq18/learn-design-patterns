package com.lxq18.learn.design.patterns.chain_responsibility.springmvc.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new HelloInterceptor()).addPathPatterns("/*").excludePathPatterns("/hello/**").order(1);
        registry.addInterceptor(new WorldInterceptor()).addPathPatterns("/*").excludePathPatterns("/hello/**").order(0);
        System.out.println("===========   拦截器注册完毕   ===========");
    }
}
