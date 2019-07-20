package com.demo.mms.dao;

import com.demo.mms.common.domain.LiteratureReview;

public interface LiteratureReviewMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LiteratureReview record);

    int insertSelective(LiteratureReview record);

    LiteratureReview selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LiteratureReview record);

    int updateByPrimaryKey(LiteratureReview record);

    int selectMaxVersion(Integer course_id);

    LiteratureReview selectLiteratureReview(Integer course_id, int version);
}