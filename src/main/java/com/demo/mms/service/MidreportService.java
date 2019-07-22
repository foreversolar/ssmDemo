package com.demo.mms.service;

import com.demo.mms.common.domain.Midreport;

public interface MidreportService {
    void addMidreport(Midreport midreport);
    Integer addMaxversion(int course_id);
    Midreport findreport(int course_id,int version);
    void addMidreportpath(String finalpath,String course_id,String version,String originalFilename);
    void addTeacherOpinion(String course_id, String advice, String auditStatus);
}
