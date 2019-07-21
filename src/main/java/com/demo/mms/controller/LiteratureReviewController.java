package com.demo.mms.controller;

import com.demo.mms.common.domain.LiteratureReview;
import com.demo.mms.service.LiteratureReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class LiteratureReviewController {
    @Autowired
    private LiteratureReviewService literatureReviewService;

    @RequestMapping(value="/addLiteratureReview",method= RequestMethod.POST)
    @ResponseBody
    public Object addLiteratureReview(@RequestBody LiteratureReview literatureReview){
        literatureReviewService.addLiteratureReview(literatureReview);
        Map<String,Object> rs = new HashMap<>(64);
        rs.put("success",true);
        return rs;
    }

    @RequestMapping("/getLiteratureReview")
    @ResponseBody
    public Object getLiteratureReview(int course_id,int version){
        System.out.println(course_id);
        LiteratureReview literatureReview=literatureReviewService.getLiteratureReview(new Integer(course_id),version);
        Map<String,Object> rs = new HashMap<>(64);
        rs.put("success",true);
        return literatureReview;
    }


    @RequestMapping("/saveAttachment")
    @ResponseBody
    public Object fileUpload(List<MultipartFile> items){
        //对上传图像进行解析操作
        if(items !=null && items.size()>0){
            for (MultipartFile item : items) {
                //获取上传文件的原始名称
                String originalFilename = item.getOriginalFilename();
                //设置上传文件的保存地址目录
                String dirPath="C:\\Users\\nemo\\Desktop\\files\\LiteratureReview";
                File file =new File(dirPath);
                //如果保存文件的地址不存在，就先创建目录
                if(!file.exists()){
                    file.mkdirs();
                }
                //使用UUID重新命名上传的文件名称（看公司需求，也可以用日期时间）
                String newFilename= originalFilename;
                try {
                    //使用MultipartFile接口的方法完成文件上传到指定位置
                    item.transferTo(new File(dirPath+"\\"+""+"\\"+newFilename));//中间的没写的字符串应该为学生id
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
