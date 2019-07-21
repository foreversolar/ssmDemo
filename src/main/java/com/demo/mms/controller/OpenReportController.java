package com.demo.mms.controller;

import com.demo.mms.common.domain.*;
import com.demo.mms.common.utils.IDGenerator;
import com.demo.mms.service.AdminService;
import com.demo.mms.service.OpenReportService;
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
    public Object getOpenReport(int course_id){
//        System.out.println(course_id);
        OpenReport openReport=openReportService.getOpenreport(new Integer(course_id));
//        System.out.println(openReport.getCourseId());
        Map<String,Object> rs = new HashMap<>(64);
        rs.put("success",true);

        return openReport;
    }

}
