package com.demo.mms.controller;

import com.demo.mms.common.domain.Midreport;
import com.demo.mms.common.domain.Translation;
import com.demo.mms.service.TranslationService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Controller
public class TranslationController {
    @Autowired
    private TranslationService translationService;

    @RequestMapping(value = "/addTranslation",method = RequestMethod.POST)
    @ResponseBody
    public Object saveTranslation(@RequestBody Translation translation){
        Integer integer = translationService.getVersion(translation.getCourse_id());
        System.out.println("1:"+integer);
        if(integer==null){
            integer=0;
        }
        translation.setVersion(integer+1);
        translationService.addTranslation(translation);
        Map<String,Object> rs = new HashMap<>(64);
        rs.put("success",true);
        return rs;
    }
    @RequestMapping("/getTranslation")
    @ResponseBody
    public Object returnTranslation(int course_id){
        Integer version=translationService.getVersion(course_id);
        Translation translationtl = translationService.findTranslation(course_id,version);
        Map<String,Object>rs = new HashMap<>(64);
        rs.put("success",translationtl);
        return rs;
    }
    /**
     * 接收文件上传请求
     */
    @RequestMapping("/saveTranslation")
    @ResponseBody
    public Object saveFile(List<MultipartFile> items, @Param("course_id") int course_id,@Param("type") String type,HttpServletRequest request) {
        String savePath = request.getSession().getServletContext().getRealPath("/storage");
        if (items != null && items.size() > 0) {
            Integer version = translationService.getVersion(course_id);
            if (version == null) {
                version = 0;
            }
            for (MultipartFile item : items) {
                String originalFilename = item.getOriginalFilename();
                String dirPath = savePath + "\\" + course_id + "\\";
                File file = new File(dirPath);
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
                    if(type.equals("origin")) {
                        translationService.addTranslation1path(dbpath, Integer.toString(course_id), Integer.toString(version), originalFilename);
                    }
                    if(type.equals("translated")){
                        translationService.addTranslation2path(dbpath, Integer.toString(course_id), Integer.toString(version), originalFilename);
                    }
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
    @RequestMapping("/getAllTranslation")
    @ResponseBody
    public Object returnOpenReportToTeacher(Integer teacher_id){
        List<Translation> temp=translationService.returnTranslationToTeacher(teacher_id);
        Map<String,List<Translation>> rs=new HashMap<>(64);
        rs.put("success",temp);
        return rs;
    }

    @RequestMapping("/addTranslationTeacherOpinion")
    @ResponseBody
    public Object addTeacherOpinion(@Param("course_id")Integer course_id, @Param("advice")String advice, @Param("AuditStatus")String AuditStatus){
        translationService.addTeacherOpinion(Integer.toString(course_id),advice,AuditStatus);
        Map<String,Object> rs = new HashMap<>(64);
        rs.put("success",true);
        return rs;
    }
}
