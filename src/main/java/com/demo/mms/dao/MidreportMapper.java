package com.demo.mms.dao;

import com.demo.mms.common.domain.Midreport;
import com.demo.mms.common.domain.OpenReport;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MidreportMapper {
    int insertMidreport(Midreport midreport);
    Integer selectMaxversion(int course_id);
    Midreport selectMidreport(@Param("course_id") int course_id, @Param("version") int version);
    void insertMidreportpath(@Param("finalpath")String finalpath,@Param("course_id")String course_id,@Param("version")String version,@Param("originalFilename")String originalFilename);
    void insertTeacherOpinion(@Param("course_id")String course_id, @Param("advice")String advice, @Param("auditStatus")String auditStatus);

    List<Midreport> returnMidReportToTeacher(Integer teacher_id);
}
