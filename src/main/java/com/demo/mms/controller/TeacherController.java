package com.demo.mms.controller;

import com.demo.mms.common.domain.course;
import com.demo.mms.service.TeacherService;
import com.demo.mms.service.courseService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
public class TeacherController {
    @Autowired
    private TeacherService teacherService;
    @Autowired
    private courseService courseService;
//    private  CourseService courseService;

    @RequestMapping("/checkTeacherUserName")
    @ResponseBody
    public boolean checkUserName(int usr){ return teacherService.checkUserName(usr); }

    @RequestMapping("/checkTeacherUsrANDPwd")
    @ResponseBody
    public Object checkUsrANDPwd(@Param("usr") Integer usr, @Param("pwd") String pwd, HttpSession session){
        String msg=null;
        Map<String,Object> rs = new HashMap<>(64);
        if(teacherService.checkUsrANDPwd(usr,pwd)){
           msg="登录成功";
            rs.put("msg",msg);
            session.setAttribute("current_user",usr);
        }else{
            msg="用户名或密码错误";
            rs.put("msg",msg);
        }
        return rs;

    }

    @RequestMapping("/getTeacherUser")
    @ResponseBody
    public Object getUser(HttpSession session){
        Map<String,Object>rs = new HashMap<>(64);
        Integer currentUser = (Integer) session.getAttribute("current_user");
        rs.put("current_user",currentUser);
        return rs;
    }

    @RequestMapping("/getTeacherInformation")
    @ResponseBody
    public Object getTeacherInformation(int teacherId){
        return teacherService.getTeacher(teacherId);
    }


}
