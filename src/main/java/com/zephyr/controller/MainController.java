package com.zephyr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/11/3.
 */
@Controller
@RequestMapping(value = "")   //拦截localhost：8080下的所有请求
public class MainController {

    @RequestMapping(value = "/test")
    public String test(){
        return "test";
    }
}
