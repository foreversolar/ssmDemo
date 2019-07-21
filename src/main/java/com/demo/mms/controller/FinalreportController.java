package com.demo.mms.controller;

import com.demo.mms.common.domain.Finalreport;
import com.demo.mms.service.FinalreportService;
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
public class FinalreportController {
    @Autowired
    private FinalreportService finalreportService;

    @RequestMapping(value="/addFinalreport",method= RequestMethod.POST)
    @ResponseBody
    public Object addFinalreport(@RequestBody Finalreport finalreport){
        Integer version = finalreportService.addMaxversion(finalreport.getStudentid());
        if(version==null){
            version=0;
        }
        finalreport.setVersion(version+1);
        finalreportService.addFinalreport(finalreport);
        Map<String,Object> rs = new HashMap<>(64);
        rs.put("success",true);
        return rs;
    }
    @RequestMapping("/returnFinalreport")
    @ResponseBody
    public Object returnFinalreport(int studentid){
        Integer version = finalreportService.addMaxversion(studentid);
        Finalreport finalreport= finalreportService.findFinalreport(studentid,version);
        Map<String,Object> rs = new HashMap<>(64);
        rs.put("success",finalreport);
        return rs;
    }
    /**
     * 接收文件上传请求
     */
    @RequestMapping(value = "/saveFinalreport",method = RequestMethod.POST)
    @ResponseBody
    public Object saveFile(List<MultipartFile> items, @Param("studentid")Integer studentid, @Param("type") String type, HttpServletRequest request){
        String savePath = request.getSession().getServletContext().getRealPath("/storage");;
        if(items !=null && items.size()>0){
            Integer version = finalreportService.addMaxversion(studentid);
            if (version==null){
                version=0;
            }
            for (MultipartFile item : items) {
                //获取上传文件的原始名称
                String originalFilename = item.getOriginalFilename();
                String dirPath=savePath+"\\"+studentid+"\\";
                File file =new File(dirPath);
                if(!file.exists()){
                    file.mkdirs();
                }
                String newFilename= UUID.randomUUID()+originalFilename.substring(originalFilename.lastIndexOf("."));;
                String finalpath= dirPath+newFilename;
                String dbpath="/storage\\"+studentid+"\\"+newFilename;
                try {
                    //使用MultipartFile接口的方法完成文件上传到指定位置
                    item.transferTo(new File(finalpath));
                    if(type.equals("paper")){
                        finalreportService.addFinalreportpath(originalFilename,dbpath,Integer.toString(studentid),Integer.toString(version));
                        System.out.println("1; "+originalFilename);
                    }
                    if(type.equals("result")){
                        finalreportService.addFinalresultpath(originalFilename,dbpath,Integer.toString(studentid),Integer.toString(version));
                        System.out.println("2; "+originalFilename);
                    }
                    if(type.equals("other")){
                        finalreportService.addFinalotherpath(originalFilename,dbpath,Integer.toString(studentid),Integer.toString(version));
                        System.out.println("3; "+originalFilename);
                    }
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

