package com.demo.mms.dao;

import com.demo.mms.common.domain.Guidance;
import org.apache.ibatis.annotations.Param;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.List;

public interface GuidanceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Guidance record);

    int insertSelective(Guidance record);

    Guidance selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Guidance record);

    int updateByPrimaryKey(Guidance record);

    int selectMaxVersion(Integer course_id);

    Guidance selectGuidance(Integer course_id);//此处service里面是getGuidance函数对应这一个

    List<Guidance> getGuidances(Integer course_id);//此处service里面是selectGuidances函数对应这一个

    void insertTeacherOpinion(@Param("course_id")String course_id, @Param("advice")String advice, @Param("auditStatus")String auditStatus);

    Integer selectMaxversion(Integer course_id);

    void insertGuidancepath(@Param("dbpath")String dbpath, @Param("course_id")String course_id, @Param("version")String version, @Param("originalFilename")String originalFilename);
}