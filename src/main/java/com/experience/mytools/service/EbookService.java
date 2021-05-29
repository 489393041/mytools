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
import com.experience.mytools.utils.CopyUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
        List<EbookResp> resp = CopyUtil.copyList(ebookList, EbookResp.class);
        return resp;
    }
}
