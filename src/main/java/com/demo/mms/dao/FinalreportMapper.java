package com.demo.mms.dao;

import com.demo.mms.common.domain.FinalReport;
import org.apache.ibatis.annotations.Param;

public interface FinalReportMapper {
    FinalReport returnFinalReport(@Param("studentid") int studentid, @Param("version") int version);

    Integer selectMaxversion(int studentid);

    void insertFinalReport(FinalReport finalreport);

    void insertFinalReportpath(@Param("originalFilename") String originalFilename,@Param("finalpath") String finalpath, @Param("studentid") String studentid, @Param("version") String version);

    void insertFinalresultpath(@Param("originalFilename") String originalFilename,@Param("finalpath") String finalpath, @Param("studentid") String studentid, @Param("version") String version);

    void insertFinalotherpath(@Param("originalFilename") String originalFilename,@Param("finalpath") String finalpath, @Param("studentid") String studentid, @Param("version") String version);

    void insertTeacherOpinion(@Param("studentid")String studentid,@Param("advice") String advice,@Param("auditStatus") String auditStatus);
}
