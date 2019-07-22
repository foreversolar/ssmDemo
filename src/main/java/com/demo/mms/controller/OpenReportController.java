package com.demo.mms.controller;

import com.demo.mms.common.domain.*;
import com.demo.mms.common.utils.IDGenerator;
import com.demo.mms.service.AdminService;
import com.demo.mms.service.OpenReportService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
public class OpenReportController {
    @Autowired
    private OpenReportService openReportService;

    @RequestMapping(value="/addOpenReport",method= RequestMethod.POST)
    @ResponseBody
    public Object addOpenReport(@RequestBody OpenReport openReport){
        openReportService.addOpenReport(openReport);
        Map<String,Object> rs = new HashMap<>(64);
        rs.put("success",true);
        return rs;
    }

    @RequestMapping("/getOpenReport")
    @ResponseBody
    public Object getOpenReport(int id){
        System.out.println(id);
        OpenReport openReport=openReportService.getOpenreport(new Integer(id));
        Map<String,Object> rs = new HashMap<>(64);
        rs.put("success",true);

        return openReport;
    }
    @RequestMapping("/addOpenreportTeacherOpinion")
    @ResponseBody
    public Object addTeacherOpinion(@Param("stuentid")Integer course_id, @Param("advice")String advice, @Param("AuditStatus")String AuditStatus){
        openReportService.addTeacherOpinion(Integer.toString(course_id),advice,AuditStatus);
        Map<String,Object> rs = new HashMap<>(64);
        rs.put("success",true);
        return rs;
    }
}
