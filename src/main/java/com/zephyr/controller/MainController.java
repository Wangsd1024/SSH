package com.zephyr.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by Administrator on 2017/11/3.
 */
@Controller
@RequestMapping(value = "")
public class MainController {
    private static final Logger log = LoggerFactory.getLogger("MainLogger");

    @RequestMapping(value = "/test")
    public String test(){
        log.info("MainController -> test...");
        return "test";
    }
}
