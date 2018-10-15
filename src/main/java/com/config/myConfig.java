package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by qxm on 2018/10/15.
 */
@Configuration
public class myConfig extends WebMvcConfigurerAdapter {

    @Bean
    public WebMvcConfigurerAdapter index(){
        WebMvcConfigurerAdapter webMvcConfigurerAdapter=new WebMvcConfigurerAdapter() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("index");
            }
        };
        return webMvcConfigurerAdapter;
    }
}
