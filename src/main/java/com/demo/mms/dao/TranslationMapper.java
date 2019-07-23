package com.demo.mms.dao;

import com.demo.mms.common.domain.Translation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TranslationMapper {

    int insertTranslation(Translation translation);

    Integer getVersion(int course_id);

    Translation selectTranslation(@Param("course_id") int course_id, @Param("version") int version);

    void insertTeacherOpinion(@Param("course_id")String course_id, @Param("advice")String advice, @Param("auditStatus")String auditStatus);

    void insertTranslation1path(@Param("dbpath")String dbpath, @Param("course_id")String course_id, @Param("version")String version, @Param("originalFilename")String originalFilename);

    void insertTranslation2path(@Param("dbpath")String dbpath, @Param("course_id")String course_id, @Param("version")String version, @Param("originalFilename")String originalFilename);

    List<Translation> returnTranslationToTeacher(Integer teacher_id);
}