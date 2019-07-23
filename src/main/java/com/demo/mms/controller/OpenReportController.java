package com.demo.mms.controller;

import com.demo.mms.common.domain.*;
import com.demo.mms.common.utils.IDGenerator;
import com.demo.mms.service.AdminService;
import com.demo.mms.service.OpenReportService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Controller
public class OpenReportController {
    @Autowired
    private OpenReportService openReportService;

    @RequestMapping(value="/addOpenReport",method = RequestMethod.POST)
    @ResponseBody
    public Object addOpenReport(@RequestBody OpenReport openReport){
        openReportService.addOpenReport(openReport);
        Map<String,Object> rs = new HashMap<>(64);
        rs.put("success",true);
        return rs;
    }

    @RequestMapping("/getOpenReport")
    @ResponseBody
    public Object getOpenReport(int id){
        System.out.println(id);
        OpenReport openReport=openReportService.getOpenreport(new Integer(id));
        Map<String,Object> rs = new HashMap<>(64);
        rs.put("success",true);

        return openReport;
    }
    @RequestMapping("/saveOpenReport")
    @ResponseBody
    public Object saveFile(List<MultipartFile> items, @Param("course_id") int course_id, HttpServletRequest request) {
        String savePath = request.getSession().getServletContext().getRealPath("/storage");
        if (items != null && items.size() > 0) {
            Integer version = openReportService.addMaxversion(course_id);
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
                    System.out.println(dbpath+"  "+course_id+"  "+version+"  "+originalFilename);
                    openReportService.addMidrepcortpath(dbpath, Integer.toString(course_id), Integer.toString(version), originalFilename);

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
    @RequestMapping("/addOpenreportTeacherOpinion")
    @ResponseBody
    public Object addTeacherOpinion(@Param("course_id")Integer course_id, @Param("advice")String advice, @Param("AuditStatus")String AuditStatus){
        openReportService.addTeacherOpinion(Integer.toString(course_id),advice,AuditStatus);
        Map<String,Object> rs = new HashMap<>(64);
        rs.put("success",true);
        return rs;
    }
}
