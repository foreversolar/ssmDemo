package com.demo.mms.dao;

import com.demo.mms.common.domain.LiteratureReview;
import org.apache.ibatis.annotations.Param;

public interface LiteratureReviewMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LiteratureReview record);

    int insertSelective(LiteratureReview record);

    LiteratureReview selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LiteratureReview record);

    int updateByPrimaryKey(LiteratureReview record);

    Integer selectMaxVersion(Integer course_id);

    LiteratureReview selectLiteratureReview(@Param("course_id") Integer course_id,@Param("version") Integer version);

    void insertTeacherOpinion(@Param("course_id") String course_id,@Param("advice") String advice,@Param("auditStatus") String auditStatus);


    void insertliteratureReviewpath(@Param("dbpath")String dbpath, @Param("course_id")String course_id, @Param("version")String version, @Param("originalFilename")String originalFilename);
}
