package com.demo.mms.service;

public interface CheckResultService {
    String findFinalReportState(int studentid);

    String findGuidanceState(int course_id);

    String findTranslationState(int course_id);

    String findMidReportState(int course_id);

    String findOpenReportState(int course_id);

    String findLiteratureReviewState(int course_id);
}
