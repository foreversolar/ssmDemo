package com.demo.mms.service;

import com.demo.mms.common.domain.Midreport;
import com.demo.mms.common.domain.OpenReport;
import com.demo.mms.dao.MidreportMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MidreportServicceImpl implements MidreportService{
    @Autowired
    MidreportMapper midreportMapper;
    @Transactional
    @Override
    public void addMidreport(Midreport midreport) {
        midreportMapper.insertMidreport(midreport);
    }

    @Transactional
    @Override
    public Integer addMaxversion(int course_id) {
        return midreportMapper.selectMaxversion(course_id);
    }

    @Transactional
    @Override
    public Midreport findreport(int course_id,int version) {
        return midreportMapper.selectMidreport(course_id,version);
    }

    @Transactional
    @Override
    public void addMidreportpath(String finalpath,String course_id,String version,String originalFilename){
        midreportMapper.insertMidreportpath(finalpath,course_id,version,originalFilename);

    }

    @Override
    public void addTeacherOpinion(String course_id, String advice, String auditStatus) {
        midreportMapper.insertTeacherOpinion(course_id,advice,auditStatus);
    }

    @Override
    public List<Midreport> returnMidReportToTeacher(Integer teacher_id) {
        return midreportMapper.returnMidReportToTeacher(teacher_id);
    }
}
