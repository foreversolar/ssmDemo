package com.demo.mms.controller;

import com.demo.mms.common.domain.CheckResult;
import com.demo.mms.common.domain.FinalReport;
import com.demo.mms.service.CheckResultService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Controller
public class CheckResultController {
    @Autowired
    private CheckResultService checkResultService;

//    @RequestMapping("/returnCheckResult")
//    @ResponseBody
//    public Object returnCheckResult(@Param("course_id") int course_id,@Param("studentid")int studentid){
//        ArrayList<String> resultList=new ArrayList<>();
//        try{
//            CheckResult checkResult=new CheckResult();
//            checkResult.setFinalReportState(checkResultService.findFinalReportState(studentid));
//            checkResult.setGuidanceState(checkResultService.findGuidanceState(course_id));
//            checkResult.setLiteratureReviewState(checkResultService.findLiteratureReviewState(course_id));
//            checkResult.setMidReportState(checkResultService.findMidReportState(course_id));
//            checkResult.setOpenReportState(checkResultService.findOpenReportState(course_id));
//            checkResult.setTranslationState(checkResultService.findTranslationState(course_id));
//            FinalReport finalreport=checkResultService.findScore(studentid);
//            double finalScore=0.4*finalreport.getScore1()+0.3*finalreport.getScore2()+0.3*finalreport.getScore3();
//            checkResult.setScore(finalScore);
//            Map<String,Object> rs = new HashMap<>(64);
//            rs.put("success",checkResult);
//            resultList.add(checkResultService.findFinalReportState(studentid));
//
//            return rs;
//
//        }catch (NullPointerException ne){
//            Map<String,Object> rs = new HashMap<>(64);
//            rs.put("error","没有记录");
//            return rs;
//        }
//
//    }


    @RequestMapping("/returnCheckResult")
    @ResponseBody
    public Object returnCheckResult(@Param("course_id") int course_id,@Param("studentid")int studentid){
        ArrayList<String> resultList=new ArrayList<>();
        try{
            CheckResult checkResult=new CheckResult();
            resultList.add(checkResultService.findGuidanceState(course_id));
            resultList.add(checkResultService.findFinalReportState(studentid));
            resultList.add(checkResultService.findLiteratureReviewState(course_id));
            resultList.add(checkResultService.findMidReportState(course_id));
            resultList.add(checkResultService.findOpenReportState(course_id));
            resultList.add(checkResultService.findTranslationState(course_id));
          //  resultList.add(checkResultService.findScore(studentid));

            FinalReport finalreport=checkResultService.findScore(studentid);
            double finalScore=0.4*finalreport.getScore1()+0.3*finalreport.getScore2()+0.3*finalreport.getScore3();
            checkResult.setScore(finalScore);

            return resultList;

        }catch (NullPointerException ne){
            Map<String,Object> rs = new HashMap<>(64);
            rs.put("error","没有记录");
            return resultList;
        }

    }
}
