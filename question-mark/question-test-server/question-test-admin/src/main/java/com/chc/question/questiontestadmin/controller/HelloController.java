package com.chc.question.questiontestadmin.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author chenhuancai
 * @Date 2022/1/11 17:16
 * @Version 1.0
 */
@RestController
@RequestMapping(value ="/hello")
@Slf4j
public class HelloController {

    @RequestMapping("/test")
    @ResponseBody
    public String hello(){
        return "hello";
    }
}
