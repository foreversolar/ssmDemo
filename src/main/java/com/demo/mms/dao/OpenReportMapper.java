package com.demo.mms.dao;

import com.demo.mms.common.domain.OpenReport;
import org.apache.ibatis.annotations.Param;

public interface OpenReportMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OpenReport record);

    int insertSelective(OpenReport record);

    OpenReport selectByPrimaryKey(Integer id);

    Integer selectMaxVersion(Integer course_id);

    OpenReport selectOpenReport(@Param("course_id") Integer course_id, @Param("version") Integer version);

    int updateByPrimaryKeySelective(OpenReport record);

    int updateByPrimaryKey(OpenReport record);

    void insertTeacherOpinion(@Param("course_id")String course_id, @Param("advice")String advice, @Param("auditStatus")String auditStatus);

    void insertOpenReportpath(@Param("dbpath")String finalpath,@Param("course_id")String course_id,@Param("version")String version,@Param("originalFilename")String originalFilename);
}