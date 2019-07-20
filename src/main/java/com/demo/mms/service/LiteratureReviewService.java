package com.demo.mms.service;

import com.demo.mms.common.domain.LiteratureReview;
import org.springframework.transaction.annotation.Transactional;

public interface LiteratureReviewService {

    @Transactional
    void addLiteratureReview(LiteratureReview literatureReview);

    LiteratureReview getLiteratureReview(Integer course_id, int version);
}
