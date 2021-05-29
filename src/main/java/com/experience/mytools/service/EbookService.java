package com.experience.mytools.service;

/**
 * @program: mytools
 * @description:
 * @author:hch
 * @createDate:2021-05-29 14:40
 * @version:1.0
 */

import com.experience.mytools.domain.Ebook;
import com.experience.mytools.domain.EbookExample;
import com.experience.mytools.mapper.EbookMapper;
import com.experience.mytools.req.EbookReq;
import com.experience.mytools.resp.EbookResp;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class EbookService {
    @Resource
    private EbookMapper ebookMapper;

    public List<EbookResp> list(EbookReq req){
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%"+req.getName()+"%");
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);
        ArrayList<EbookResp> resp = new ArrayList<>();
        for (Ebook ebook : ebookList) {
            EbookResp ebookResp = new EbookResp();
            BeanUtils.copyProperties(ebook,ebookResp);
            resp.add(ebookResp);
        }
        return resp;
    }
}
