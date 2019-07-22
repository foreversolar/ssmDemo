package com.demo.mms.dao;

import com.demo.mms.common.domain.FinalReport;

public interface CheckResultMapper {
    String selectFinalReportState(int studentid);

    String selectTranslationState(int course_id);

    String selectMidReportState(int course_id);

    String selectOpenReportState(int course_id);

    String selectLiteratureReviewState(int course_id);

    String selectGuidanceState(int course_id);

    FinalReport selectScore(int studentid);
}
