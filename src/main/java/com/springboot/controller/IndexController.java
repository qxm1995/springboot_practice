package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * Created by qxm on 2018/10/11.
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/user/login",method = RequestMethod.POST)
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String,Object> map){
        if (!StringUtils.isEmpty(username) && "123".equals(password)){
            return "dashboard";
        }else {
            map.put("error","用户不存在或密码错误");
            return "index";
        }

    }
}
