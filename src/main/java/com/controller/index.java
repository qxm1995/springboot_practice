package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qxm on 2018/10/11.
 */
@RestController
public class index {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
