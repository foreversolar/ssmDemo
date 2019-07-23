package com.demo.mms.controller;


import com.demo.mms.common.domain.Midreport;
import com.demo.mms.common.domain.course;
import com.demo.mms.service.courseService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
public class courseController {
    @Autowired
    private courseService courseService;
    @RequestMapping("/getCourse")
    @ResponseBody
    public Object returnCourse(@Param("student_id") int student_id){
        course coursetl=courseService.findcourse(student_id);
        Map<String,Object>rs = new HashMap<>(64);
        Object success = (Object) rs.put("success", coursetl);
        return rs;
    }
    @RequestMapping("/getCourseByTeacherId")
    @ResponseBody
    public Object getCourseByTeacherId(@Param("inst_id") int inst_id){
        List<course> coursetl=courseService.getCourseByTeacherId(inst_id);
        Map<String,List<course>> rs=new HashMap<>(64);
        rs.put("success",coursetl);
        return rs;
    }
}
