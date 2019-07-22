package com.demo.mms.dao;

import com.demo.mms.common.domain.OpenReport;
import org.apache.ibatis.annotations.Param;

public interface OpenReportMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OpenReport record);

    int insertSelective(OpenReport record);

    OpenReport selectByPrimaryKey(Integer id);

    int selectMaxVersion(Integer course_id);

    OpenReport selectOpenReport(@Param("courseId") Integer course_id, @Param("version") Integer version);

    int updateByPrimaryKeySelective(OpenReport record);

    int updateByPrimaryKey(OpenReport record);

    void insertTeacherOpinion(@Param("course_id")String course_id, @Param("advice")String advice, @Param("auditStatus")String auditStatus);
}