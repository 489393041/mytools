package com.experience.mytools.service;

/**
 * @program: mytools
 * @description:
 * @author:hch
 * @createDate:2021-05-29 14:40
 * @version:1.0
 */

import com.experience.mytools.domain.Demo;
import com.experience.mytools.mapper.DemoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DemoService {
    @Resource
    private DemoMapper demoMapper;

    public List<Demo> list(){
        return demoMapper.selectByExample(null);
    }
}
