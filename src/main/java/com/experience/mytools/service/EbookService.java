package com.experience.mytools.service;

/**
 * @program: mytools
 * @description:
 * @author:hch
 * @createDate:2021-05-29 14:40
 * @version:1.0
 */

import com.experience.mytools.domain.Ebook;
import com.experience.mytools.mapper.EbookMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EbookService {
    @Resource
    private EbookMapper ebookMapper;

    public List<Ebook> list(){
        return ebookMapper.selectByExample(null);
    }
}
