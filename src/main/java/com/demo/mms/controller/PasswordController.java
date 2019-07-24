package com.demo.mms.controller;

import com.demo.mms.common.domain.Selectcourse;
import com.demo.mms.service.PasswordService;
import com.demo.mms.service.SelectcourseService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class PasswordController {
    @Autowired
    private PasswordService passwordService;

    @RequestMapping("/resetPassword")
    @ResponseBody
    public Object resetPassword(@Param("mail") String mail, @Param("newPassword") String newPassword){
        passwordService.resetPassword(mail,newPassword);
        Map<String,Object> rs =new HashMap<>(64);
        rs.put("success",true);
        return rs;
    }

    @RequestMapping("/forgetPassword")
    @ResponseBody
    public Object resetPassword(@Param("mail") String mail){
        String href="<a href=\'http://localhost:8080/pages/mypages/modifyPw.html\'";
        href=href+"?mail="+mail+">点此重置密码</a>";


        String text="<a href=\"http://localhost:8080/pages/mypages/resetPw.html?mail="+mail+"\">点此重置密码</a>";

        SendMailThread sendMailThread=new SendMailThread(mail,"重置密码",text);
        sendMailThread.run();

        Map<String,Object> rs =new HashMap<>(64);
        rs.put("success",true);
        return rs;
    }


}
