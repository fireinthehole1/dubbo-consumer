package com.learn.controller;

import com.learn.service.TestService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bill
 * @version 1.0
 * @date 2020/11/4 9:54
 * @description
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Reference(version = "1.0.0")
    TestService testService;

    @RequestMapping("/test")
    public String test(){
        return testService.getStr();
    }
}
