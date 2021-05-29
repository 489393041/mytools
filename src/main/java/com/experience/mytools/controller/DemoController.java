package com.experience.mytools.controller;

import com.experience.mytools.domain.Demo;
import com.experience.mytools.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: mytools
 * @description:
 * @author:hch
 * @createDate:2021-05-29 13:14
 * @version:1.0
 */
@RestController
@RequestMapping("/demo")
public class DemoController {
    @Resource
    private DemoService demoService;


    @GetMapping("/list")
    public List<Demo> list(){
        return demoService.list();
    }
}
