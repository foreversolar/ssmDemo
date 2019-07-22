package com.demo.mms.controller;

import com.demo.mms.common.domain.Translation;
import com.demo.mms.service.TranslationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class TranslationController {
    @Autowired
    private TranslationService translationService;

    @RequestMapping("/addTranslation")
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
    public Object fileUpload(List<MultipartFile> items){
        //对上传图像进行解析操作
        if(items !=null && items.size()>0){
            for (MultipartFile item : items) {
                //获取上传文件的原始名称
                String originalFilename = item.getOriginalFilename();
                //设置上传文件的保存地址目录
                String dirPath="C:\\FileUpload\\";
                File file =new File(dirPath);
                //如果保存文件的地址不存在，就先创建目录
                if(!file.exists()){
                    file.mkdirs();
                }
                //使用UUID重新命名上传的文件名称（看公司需求，也可以用日期时间）
                String newFilename= originalFilename;
                try {
                    //使用MultipartFile接口的方法完成文件上传到指定位置
                    item.transferTo(new File(dirPath+newFilename));
                    //文件上传成功后，需要将文件存放路径存入数据库中
                    //TODO,省略
                } catch (Exception e) {
                    e.printStackTrace();
                    //当文件上传出现异常，则重定向到文件上传页面
                    Map<String,Object> rs = new HashMap<>(64);
                    rs.put("success",true);
                    return rs;
                }
            }
        }
        Map<String,Object> rs = new HashMap<>(64);
        rs.put("success",true);
        return rs;
    }
}
