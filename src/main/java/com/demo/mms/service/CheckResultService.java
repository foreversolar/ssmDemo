package com.demo.mms.service;

import com.demo.mms.common.domain.FinalReport;

public interface CheckResultService {
    String findFinalReportState(int studentid);

    String findGuidanceState(int course_id);

    String findTranslationState(int course_id);

    String findMidReportState(int course_id);

    String findOpenReportState(int course_id);

    String findLiteratureReviewState(int course_id);

    FinalReport findScore(int studentid);
}
