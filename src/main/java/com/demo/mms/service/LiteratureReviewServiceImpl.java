package com.demo.mms.service;

import com.demo.mms.common.domain.LiteratureReview;
import com.demo.mms.dao.LiteratureReviewMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LiteratureReviewServiceImpl implements LiteratureReviewService{
    @Autowired
    LiteratureReviewMapper literatureReviewMapper;

    @Transactional
    @Override
    public void addLiteratureReview(LiteratureReview literatureReview) {
        literatureReviewMapper.insert(literatureReview);
    }

    @Override
    public LiteratureReview getLiteratureReview(Integer course_id, int version){
        int max_version=literatureReviewMapper.selectMaxVersion(course_id);
//        System.out.println(max_version);
        LiteratureReview hellokitty=literatureReviewMapper.selectLiteratureReview(course_id,version);
//        System.out.println(hellokitty.getCurrentOverview());
        return hellokitty;
    }

    @Override
    public void addTeacherOpinion(String course_id, String advice, String auditStatus) {
        literatureReviewMapper.insertTeacherOpinion(course_id,advice,auditStatus);
    }
}