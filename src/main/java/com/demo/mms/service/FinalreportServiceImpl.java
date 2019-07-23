package com.demo.mms.service;

import com.demo.mms.common.domain.FinalReport;
import com.demo.mms.common.domain.Midreport;
import com.demo.mms.dao.FinalReportMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FinalReportServiceImpl implements FinalReportService {
    @Autowired
    FinalReportMapper finalreportMapper;

    @Transactional
    @Override
    public FinalReport findFinalReport(int studentid, int version) {
        return finalreportMapper.returnFinalReport(studentid,version);
    }

    @Transactional
    @Override
    public Integer addMaxversion(int studentid) {
        return finalreportMapper.selectMaxversion(studentid);
    }

    @Transactional
    @Override
    public void addFinalReport(FinalReport finalreport) {
        finalreportMapper.insertFinalReport(finalreport);
    }

    @Override
    public void addFinalReportpath(String originalFilename,String finalpath, String studentid, String version) {
        finalreportMapper.insertFinalReportpath(originalFilename,finalpath,studentid,version);
    }

    @Override
    public void addFinalresultpath(String originalFilename,String finalpath, String studentid, String version) {
        finalreportMapper.insertFinalresultpath(originalFilename,finalpath,studentid,version);
    }

    @Override
    public void addFinalotherpath(String originalFilename,String finalpath, String studentid, String version) {
        finalreportMapper.insertFinalotherpath(originalFilename,finalpath,studentid,version);
    }

    @Override
    public void addTeacherOpinion(String studentid,String advice, String auditStatus) {
        finalreportMapper.insertTeacherOpinion(studentid,advice,auditStatus);
    }

    @Override
    public List<Midreport> returnFinalReportToTeacher(Integer teacher_id) {
        return finalreportMapper.returnFinalReportToTeacher(teacher_id);
    }
}
