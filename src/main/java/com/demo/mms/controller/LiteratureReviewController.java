package com.demo.mms.controller;

import com.demo.mms.common.domain.LiteratureReview;
import com.demo.mms.service.LiteratureReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class LiteratureReviewController {
    @Autowired
    private LiteratureReviewService literatureReviewService;

    @RequestMapping(value="/addLiteratureReview",method= RequestMethod.POST)
    @ResponseBody
    public Object addLiteratureReview(@RequestBody LiteratureReview literatureReview){
        literatureReviewService.addLiteratureReview(literatureReview);
        Map<String,Object> rs = new HashMap<>(64);
        rs.put("success",true);
        return rs;
    }

    @RequestMapping("/getLiteratureReview")
    @ResponseBody
    public Object getLiteratureReview(int course_id,int version){
        System.out.println(course_id);
        LiteratureReview literatureReview=literatureReviewService.getLiteratureReview(new Integer(course_id),version);
        Map<String,Object> rs = new HashMap<>(64);
        rs.put("success",true);
        return literatureReview;
    }

}
