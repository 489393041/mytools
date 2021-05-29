package com.experience.mytools.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: mytools
 * @description:
 * @author:hch
 * @createDate:2021-05-29 13:14
 * @version:1.0
 */
@RestController
public class TestController {
    @Value("${test.hello:TEST}")
    private String testHello;

    @PostMapping("/hello")
    public String hello(){
        return testHello;
    }

    @PostMapping("/hello/post")
    public String helloPost(String name){
        return "Hello Post!"+ name;
    }
}
