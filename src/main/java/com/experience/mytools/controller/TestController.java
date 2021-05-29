package com.experience.mytools.controller;

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
    @PostMapping("/hello")
    public String hello(){
        return "hello word!";
    }

    @PostMapping("/hello/post")
    public String helloPost(String name){
        return "Hello Post!"+ name;
    }
}
