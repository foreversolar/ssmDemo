package com.demo.mms.dao;

import com.demo.mms.common.domain.Finalreport;
import org.apache.ibatis.annotations.Param;

public interface FinalreportMapper {
    Finalreport returnFinalreport(@Param("studentid") int studentid, @Param("version") int version);

    Integer selectMaxversion(int studentid);

    void insertFinalreport(Finalreport finalreport);

    void insertFinalreportpath(@Param("originalFilename") String originalFilename,@Param("finalpath") String finalpath, @Param("studentid") String studentid, @Param("version") String version);

    void insertFinalresultpath(@Param("originalFilename") String originalFilename,@Param("finalpath") String finalpath, @Param("studentid") String studentid, @Param("version") String version);

    void insertFinalotherpath(@Param("originalFilename") String originalFilename,@Param("finalpath") String finalpath, @Param("studentid") String studentid, @Param("version") String version);

    void insertTeacherOpinion(@Param("studentid")String studentid,@Param("advice") String advice,@Param("auditStatus") String auditStatus);
}
