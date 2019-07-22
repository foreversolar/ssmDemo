package com.demo.mms.controller;

import com.demo.mms.common.domain.Guidance;
import com.demo.mms.service.GuidanceService;
import org.apache.ibatis.annotations.Param;
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
public class GuidanceController {
    @Autowired
    private GuidanceService guidanceService;

    @RequestMapping(value="/addGuidance",method= RequestMethod.POST)
    @ResponseBody
    public Object addGuidance(@RequestBody Guidance guidance){
        guidanceService.addGuidance(guidance);
        Map<String,Object> rs = new HashMap<>(64);
        rs.put("success",true);
        return rs;
    }

    @RequestMapping("/getGuidance")
    @ResponseBody
    public Object getGuidance(int course_id,int version){
        System.out.println(course_id);
        Guidance guidance=guidanceService.getGuidance(new Integer(course_id),version);
        Map<String,Object> rs = new HashMap<>(64);
        rs.put("success",true);
        return guidance;
    }

    @RequestMapping("selectGuidances")
    @ResponseBody
    public List<Guidance> selectGuidances(int course_id){
        List<Guidance> guidances=guidanceService.selectGuidances(course_id);
        return  guidances;
    }
    @RequestMapping("/addGuidanceTeacherOpinion")
    @ResponseBody
    public Object addTeacherOpinion(@Param("course_id")Integer course_id, @Param("advice")String advice, @Param("AuditStatus")String AuditStatus){
        guidanceService.addTeacherOpinion(Integer.toString(course_id),advice,AuditStatus);
        Map<String,Object> rs = new HashMap<>(64);
        rs.put("success",true);
        return rs;
    }
}
