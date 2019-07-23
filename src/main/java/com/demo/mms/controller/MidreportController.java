package com.demo.mms.controller;

import com.demo.mms.common.domain.*;
import com.demo.mms.service.MidreportService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Controller
public class MidreportController {
    @Autowired
    private MidreportService midreportService;

    @RequestMapping(value = "/addMidreport", method = RequestMethod.POST)
    @ResponseBody
    public Object saveMidreport(@RequestBody Midreport midreport) {
        Integer integer = midreportService.addMaxversion(midreport.getCourse_id());
        if (integer == null) {
            integer = 0;
        }
        midreport.setVersion(integer + 1);
        midreportService.addMidreport(midreport);
        Map<String, Object> rs = new HashMap<>(64);
        rs.put("success", true);
        return rs;
    }

    @RequestMapping("/returnMidreport")
    @ResponseBody
    public Object returnMidreport(int course_id) {
        Integer version = midreportService.addMaxversion(course_id);
        Midreport midreport1 = midreportService.findreport(course_id, version);
        Map<String, Object> rs = new HashMap<>(64);
        rs.put("success", midreport1);
        return rs;
    }

    /**
     * 接收文件上传请求
     */
    @RequestMapping("/saveMidreport")
    @ResponseBody
    public Object saveFile(List<MultipartFile> items, @Param("course_id") int course_id, HttpServletRequest request) {
        String savePath = request.getSession().getServletContext().getRealPath("/storage");
        ;
        //对上传图像进行解析操作
        if (items != null && items.size() > 0) {
            Integer version = midreportService.addMaxversion(course_id);
            if (version == null) {
                version = 0;
            }
            for (MultipartFile item : items) {
                //获取上传文件的原始名称
                String originalFilename = item.getOriginalFilename();
                String dirPath = savePath + "\\" + course_id + "\\";
                //设置上传文件的保存地址目录
                File file = new File(dirPath);
                //如果保存文件的地址不存在，就先创建目录
                if (!file.exists()) {
                    file.mkdirs();
                }
                String newFilename = UUID.randomUUID() + originalFilename.substring(originalFilename.lastIndexOf("."));
                ;
                String finalpath = dirPath + newFilename;
                String dbpath = "/storage\\" + course_id + "\\" + newFilename;
                try {
                    //使用MultipartFile接口的方法完成文件上传到指定位置
                    item.transferTo(new File(finalpath));
                    midreportService.addMidreportpath(dbpath, Integer.toString(course_id), Integer.toString(version), originalFilename);
                    //文件上传成功后，需要将文件存放路径存入数据库中
                    //TODO,省略
                } catch (Exception e) {
                    e.printStackTrace();
                    //当文件上传出现异常，则重定向到文件上传页面
                    Map<String, Object> rs = new HashMap<>(64);
                    rs.put("success", true);
                    return rs;
                }
            }
        }
        Map<String, Object> rs = new HashMap<>(64);
        rs.put("success", true);
        return rs;
    }

    @RequestMapping("/addMidreportTeacherOpinion")
    @ResponseBody
    public Object addTeacherOpinion(@Param("course_id") Integer course_id, @Param("advice") String advice, @Param("AuditStatus") String AuditStatus) {
        midreportService.addTeacherOpinion(Integer.toString(course_id), advice, AuditStatus);
        Map<String, Object> rs = new HashMap<>(64);
        rs.put("success", true);
        return rs;
    }


    @RequestMapping("/getAllMidReport")
    @ResponseBody
    public Object returnOpenReportToTeacher(Integer teacher_id){
        List<Midreport> temp=midreportService.returnMidReportToTeacher(teacher_id);
        Map<String,List<Midreport>> rs=new HashMap<>(64);
        rs.put("success",temp);
        return rs;
    }
}
