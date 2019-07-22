package com.demo.mms.dao;

import org.apache.ibatis.annotations.Param;

public interface TranslationMapper {

    int insertTranslation(Translation translation);

    Integer getVersion(int course_id);

    Translation selectTranslation(@Param("course_id") int course_id, @Param("version") int version);

    void insertTeacherOpinion(@Param("course_id")String course_id, @Param("advice")String advice, @Param("auditStatus")String auditStatus);
}