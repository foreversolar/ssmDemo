package com.demo.mms.service;

import com.demo.mms.common.domain.OpenReport;
import com.demo.mms.dao.OpenReportMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OpenReportServiceImpl implements OpenReportService{
    @Autowired
    OpenReportMapper openReportMapper;

    @Transactional
    @Override
    public void addOpenReport(OpenReport openReport) {
        openReportMapper.insert(openReport);
    }

    @Override
    public OpenReport getOpenreport(Integer course_id){
        int max_version=openReportMapper.selectMaxVersion(course_id);
//        System.out.println(max_version);
        OpenReport hellokitty=openReportMapper.selectOpenReport(course_id,max_version);
//        System.out.println(hellokitty.getCurrentOverview());
        return hellokitty;
    }

    @Override
    public void addTeacherOpinion(String course_id, String advice, String auditStatus) {
        openReportMapper.insertTeacherOpinion(course_id,advice,auditStatus);
    }
}
