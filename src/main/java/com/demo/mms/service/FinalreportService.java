package com.demo.mms.service;

import com.demo.mms.common.domain.Finalreport;

public interface FinalreportService {
    Finalreport findFinalreport(int studentid,int version);

    Integer addMaxversion(int studentid);

    void addFinalreport(Finalreport finalreport);

    void addFinalreportpath(String originalFilename,String finalpath, String studentid, String version);

    void addFinalresultpath(String originalFilename,String finalpath, String toString, String toString1);

    void addFinalotherpath(String originalFilename,String finalpath, String toString, String toString1);

    void addTeacherOpinion(String studentid,String advice, String auditStatus);
}
