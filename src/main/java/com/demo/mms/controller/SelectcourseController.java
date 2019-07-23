package com.demo.mms.controller;

import com.demo.mms.common.domain.Selectcourse;
import com.demo.mms.service.SelectcourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class SelectcourseController {
    @Autowired
    private  SelectcourseService selectcourseService;

    @RequestMapping("/addSelectcourse")
    @ResponseBody
    public Object addSelectcourse(@RequestBody Selectcourse selectcourse){
        selectcourseService.addSelectcourse(selectcourse);
        Map<String,Object>rs =new HashMap<>(64);
        rs.put("success",true);
        return rs;
    }

    @RequestMapping("/getSelectcourse")
    @ResponseBody
    public Object getSelectcourse(int course_id){
        Selectcourse selectcoursetl=selectcourseService.getSelectcourse(course_id);
        Map<String,Object>rs = new HashMap<>(64);
        rs.put("success",selectcoursetl);
        return rs;
    }
}
