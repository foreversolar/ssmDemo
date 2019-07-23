package com.demo.mms.service;
import com.demo.mms.common.domain.*;
import org.springframework.transaction.annotation.Transactional;

public interface OpenReportService {
    @Transactional
    void addOpenReport(OpenReport openReport);
    OpenReport getOpenreport(Integer id);

    void addTeacherOpinion(String toString, String advice, String auditStatus);

    Integer addMaxversion(int course_id);

    void addMidrepcortpath(String dbpath, String course_id, String version, String originalFilename);
}
