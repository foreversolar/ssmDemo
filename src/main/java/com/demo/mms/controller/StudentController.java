package com.demo.mms.controller;

import com.demo.mms.common.domain.Student;
import com.demo.mms.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;
//    private  CourseService courseService;

    @RequestMapping("/checkUserName")
    @ResponseBody
    public boolean checkUserName(int usr){ return studentService.checkUserName(usr); }

    @RequestMapping("/checkUsrANDPwd")
    @ResponseBody
    public boolean checkUsrANDPwd(int usr,String pwd){
        return studentService.checkUsrANDPwd(usr,pwd);
    }

/*    @RequestMapping("fetchThePassword")
    @ResponseBody
    public */
    /*@RequestMapping("/getStudentInformation")
    @ResponseBody
    public Object getStudentInformation(int stuId){
        Course course=courseService.getCourse(stuId);//在course中实现
//        return studentService.getStudent(stuId);
    }
*/
}
