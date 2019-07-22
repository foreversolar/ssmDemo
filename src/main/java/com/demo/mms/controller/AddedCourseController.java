package com.demo.mms.controller;

import com.demo.mms.common.domain.AddedCourse;
import com.demo.mms.common.domain.Midreport;
import com.demo.mms.service.AddedCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class AddedCourseController {
    @Autowired
    private AddedCourseService addedCourseService;

    @RequestMapping("/addAddedCourse")
    @ResponseBody
    public Object addAddedCourse(AddedCourse addedCourse){
        addedCourseService.addNewCourse(addedCourse);
        Map<String,Object> rs = new HashMap<>(64);
        rs.put("success",true);
        return rs;
    }

    @RequestMapping("/returnAddedCourse")
    @ResponseBody
    public Object returnMidreport(int course_id){
        AddedCourse addedCourse= addedCourseService.findAddedCourse(course_id);
        Map<String,Object> rs = new HashMap<>(64);
        rs.put("success",addedCourse);
        return rs;
    }

    @RequestMapping(value="/deleteAddedCourse")
    @ResponseBody
    public Object deleteAddedCourse(int course_id){
        addedCourseService.deleteCourse(course_id);
        Map<String,Object> rs = new HashMap<>(64);
        rs.put("success",true);
        return rs;
    }
}
