package com.demo.mms.controller;

import com.demo.mms.common.domain.CheckResult;
import com.demo.mms.service.CheckResultService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class CheckResultController {
    @Autowired
    private CheckResultService checkResultService;

    @RequestMapping("/returnCheckResult")
    @ResponseBody
    public Object returnCheckResult(@Param("course_id") int course_id,@Param("studentid")int studentid){
        CheckResult checkResult=new CheckResult();
        checkResult.setFinalReportState(checkResultService.findFinalReportState(studentid));
        checkResult.setGuidanceState(checkResultService.findGuidanceState(course_id));
        checkResult.setLiteratureReviewState(checkResultService.findLiteratureReviewState(course_id));
        checkResult.setMidReportState(checkResultService.findMidReportState(course_id));
        checkResult.setOpenReportState(checkResultService.findOpenReportState(course_id));
        checkResult.setTranslationState(checkResultService.findTranslationState(course_id));
        Map<String,Object> rs = new HashMap<>(64);
        rs.put("success",checkResult);
        return rs;
    }
}
