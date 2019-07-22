package com.demo.mms.service;

import com.demo.mms.common.domain.FinalReport;
import com.demo.mms.dao.CheckResultMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckResultServiceImpl implements CheckResultService {
    @Autowired
    CheckResultMapper checkResultMapper;

    @Override
    public String findFinalReportState(int studentid) {
        return checkResultMapper.selectFinalReportState(studentid);
    }

    @Override
    public String findGuidanceState(int course_id) {
        return checkResultMapper.selectGuidanceState(course_id);
    }

    @Override
    public String findTranslationState(int course_id) {
        return checkResultMapper.selectTranslationState(course_id);
    }

    @Override
    public String findMidReportState(int course_id) {
        return checkResultMapper.selectMidReportState(course_id);
    }

    @Override
    public String findOpenReportState(int course_id) {
        return checkResultMapper.selectOpenReportState(course_id);
    }

    @Override
    public String findLiteratureReviewState(int course_id) {
        return checkResultMapper.selectLiteratureReviewState(course_id);
    }

    @Override
    public FinalReport findScore(int studentid) {
        return checkResultMapper.selectScore(studentid);
    }
}
