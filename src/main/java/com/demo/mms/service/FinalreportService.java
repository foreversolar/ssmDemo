package com.demo.mms.service;

import com.demo.mms.common.domain.FinalReport;
import com.demo.mms.common.domain.Midreport;

import java.util.List;

public interface FinalReportService {
    FinalReport findFinalReport(int studentid, int version);

    Integer addMaxversion(int studentid);

    void addFinalReport(FinalReport finalreport);

    void addFinalReportpath(String originalFilename,String finalpath, String studentid, String version);

    void addFinalresultpath(String originalFilename,String finalpath, String toString, String toString1);

    void addFinalotherpath(String originalFilename,String finalpath, String toString, String toString1);

    void addTeacherOpinion(String studentid,String advice, String auditStatus);

    List<Midreport> returnFinalReportToTeacher(Integer teacher_id);
}
