package com.demo.mms.controller;

import com.demo.mms.common.domain.Student;
import com.demo.mms.common.domain.course;
import com.demo.mms.service.StudentService;
import com.demo.mms.service.courseService;
import org.apache.ibatis.annotations.Param;
import org.apache.shiro.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.testng.mustache.Model;
import sun.applet.resources.MsgAppletViewer;

import javax.servlet.http.HttpSession;
import java.util.Currency;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private courseService courseService;
//    private  CourseService courseService;

    @RequestMapping("/checkUserName")
    @ResponseBody
    public boolean checkUserName(int usr){ return studentService.checkUserName(usr); }

    @RequestMapping("/checkUsrANDPwd")
    @ResponseBody
    public Object checkUsrANDPwd(@Param("usr") Integer usr, @Param("pwd") String pwd,@Param("role") Integer role, HttpSession session){
        String msg=null;
        Map<String,Object> rs = new HashMap<>(64);
        if(studentService.checkUsrANDPwd(usr,pwd)){
           msg="登录成功";
            rs.put("msg",msg);
            session.setAttribute("role",role);
            session.setAttribute("current_user",usr);
        }else{
            msg="用户名或密码错误";
            rs.put("msg",msg);
        }
        return rs;

    }

    @RequestMapping("/getUser")
    @ResponseBody
    public Object getUser(HttpSession session){
        Map<String,Object>rs = new HashMap<>(64);
        Integer currentUser = (Integer) session.getAttribute("current_user");
        Integer cid = (Integer) session.getAttribute("course_id");
        Integer sid = (Integer) session.getAttribute("student_id");
        Integer student_id= currentUser;
        if(cid==null){
            course coursetl= courseService.findcourse(student_id);
            rs.put("course_id",coursetl.getId());
            cid=coursetl.getId();
        }
        rs.put("student_id",sid);
        rs.put("course_id",cid);
        rs.put("current_user",currentUser);
        return rs;
    }



    @RequestMapping("/getStudentInformation")
    @ResponseBody
    public Object getStudentInformation(int stuId){
         return studentService.getStudent(stuId);
    }

    @RequestMapping("/navigate")
    @ResponseBody
    public Object navigate(@RequestParam("course_id") Integer usr,@RequestParam("student_id") Integer sid, HttpSession session){
        session.setAttribute("course_id",usr);
        session.setAttribute("student_id",sid);
        return "success";
    }

}
