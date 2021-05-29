package com.experience.mytools.controller;

import com.experience.mytools.req.EbookReq;
import com.experience.mytools.resp.CommonResp;
import com.experience.mytools.resp.EbookResp;
import com.experience.mytools.service.EbookService;
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
@RequestMapping("/ebook")
public class EbookController {
    @Resource
    private EbookService ebookService;


    @GetMapping("/list")
    public CommonResp list(EbookReq req){
        CommonResp<List<EbookResp>> resp = new CommonResp<>();
        List<EbookResp> list = ebookService.list(req);
        resp.setContent(list);
        return resp;
    }
}
