package com.experience.mytools.service;

/**
 * @program: mytools
 * @description:
 * @author:hch
 * @createDate:2021-05-29 14:40
 * @version:1.0
 */

import com.experience.mytools.domain.Test;
import com.experience.mytools.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {
    @Resource
    private TestMapper testMapper;

    public List<Test> list(){
        return testMapper.list();
    }
}
