package com.demo.mms.controller;

import com.demo.mms.common.domain.Task;
import com.demo.mms.service.TaskService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class TaskController {
    @Autowired
    private TaskService taskService;

    @RequestMapping(value="/addTask",method= RequestMethod.POST)
    @ResponseBody
    public Object addTask(@RequestBody Task task){
        taskService.addTask(task);
        Map<String,Object> rs = new HashMap<>(64);
        rs.put("success",true);
        return rs;
    }

    @RequestMapping("/getTask")
    @ResponseBody
    public Object getTask(int course_id){
        System.out.println(course_id);
        Task task=taskService.getTask(new Integer(course_id));
        Map<String,Object> rs = new HashMap<>(64);
        rs.put("success",true);
        return task;
    }



}
