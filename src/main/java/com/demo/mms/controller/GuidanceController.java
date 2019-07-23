package com.demo.mms.controller;

import com.demo.mms.common.domain.Guidance;
import com.demo.mms.service.GuidanceService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Controller
public class GuidanceController {
    @Autowired
    private GuidanceService guidanceService;

    @RequestMapping(value="/addGuidance",method = RequestMethod.POST)
    @ResponseBody
    public Object addGuidance(@RequestBody Guidance guidance){
        Integer integer = guidanceService.addMaxversion(guidance.getCourse_id());
        if (integer == null) {
            integer = 0;
        }
        guidance.setVersion(integer+1);
        guidanceService.addGuidance(guidance);
        Map<String,Object> rs = new HashMap<>(64);
        rs.put("success",true);
        return rs;
    }

    @RequestMapping("/getGuidance")
    @ResponseBody
    public Object getGuidance(int course_id){
        Guidance guidance=guidanceService.getGuidance(new Integer(course_id));
        Map<String,Object> rs = new HashMap<>(64);
        rs.put("success",true);
        return guidance;
    }

    @RequestMapping("/selectGuidances")
    @ResponseBody
    public List<Guidance> selectGuidances(int course_id){
        List<Guidance> guidances=guidanceService.selectGuidances(course_id);
        return  guidances;
    }
    @RequestMapping("/saveGuidance")
    @ResponseBody
    public Object saveFile(List<MultipartFile> items, @Param("course_id") int course_id, HttpServletRequest request) {
        String savePath = request.getSession().getServletContext().getRealPath("/storage");
        if (items != null && items.size() > 0) {
            Integer version = guidanceService.addMaxversion(course_id);
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
                    guidanceService.addMidrepcortpath(dbpath, Integer.toString(course_id), Integer.toString(version), originalFilename);

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
    @RequestMapping("/addGuidanceTeacherOpinion")
    @ResponseBody
    public Object addTeacherOpinion(@Param("course_id")Integer course_id, @Param("advice")String advice, @Param("AuditStatus")String AuditStatus){
        guidanceService.addTeacherOpinion(Integer.toString(course_id),advice,AuditStatus);
        Map<String,Object> rs = new HashMap<>(64);
        rs.put("success",true);
        return rs;
    }
}
