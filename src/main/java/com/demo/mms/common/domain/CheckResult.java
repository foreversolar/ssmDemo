package com.demo.mms.common.domain;

public class CheckResult {
    private String TranslationState;
    private String OpenReportState;
    private String MidReportState;
    private String FinalReportState;
    private String GuidanceState;
    private String LiteratureReviewState;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setTranslationState(String translationState) {
        TranslationState = translationState;
    }

    public void setOpenReportState(String openReportState) {
        OpenReportState = openReportState;
    }

    public void setMidReportState(String midReportState) {
        MidReportState = midReportState;
    }

    public void setFinalReportState(String finalReportState) {
        FinalReportState = finalReportState;
    }

    public void setGuidanceState(String guidanceState) {
        GuidanceState = guidanceState;
    }

    public void setLiteratureReviewState(String literatureReviewState) {
        LiteratureReviewState = literatureReviewState;
    }

    public String getTranslationState() {
        return TranslationState;
    }

    public String getOpenReportState() {
        return OpenReportState;
    }

    public String getMidReportState() {
        return MidReportState;
    }

    public String getFinalReportState() {
        return FinalReportState;
    }

    public String getGuidanceState() {
        return GuidanceState;
    }

    public String getLiteratureReviewState() {
        return LiteratureReviewState;
    }
}
