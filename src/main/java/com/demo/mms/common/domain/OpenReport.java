package com.demo.mms.common.domain;

import java.util.Date;

public class OpenReport {
    private Integer id;

    private Integer courseId;

    private String courseMeaning;

    private String currentOverview;

    private String researchContent;

    private String researchMind;

    private String researchSchedule;

    private String reference;

    private Date meetingTime;

    private String meetingPlace;

    private String meetingHost;

    private Integer teacher1Id;

    private Integer teacher2Id;

    private Integer teacher3Id;

    private String meetingSummary;

    private String advice;

    private Integer version;

    private String state;

    private Date submitTime;

    public void setResult(String result) {
        this.result = result;
    }

    public String getResult() {
        return result;
    }

    private String result;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseMeaning() {
        return courseMeaning;
    }

    public void setCourseMeaning(String courseMeaning) {
        this.courseMeaning = courseMeaning == null ? null : courseMeaning.trim();
    }

    public String getCurrentOverview() {
        return currentOverview;
    }

    public void setCurrentOverview(String currentOverview) {
        this.currentOverview = currentOverview == null ? null : currentOverview.trim();
    }

    public String getResearchContent() {
        return researchContent;
    }

    public void setResearchContent(String researchContent) {
        this.researchContent = researchContent == null ? null : researchContent.trim();
    }

    public String getResearchMind() {
        return researchMind;
    }

    public void setResearchMind(String researchMind) {
        this.researchMind = researchMind == null ? null : researchMind.trim();
    }

    public String getResearchSchedule() {
        return researchSchedule;
    }

    public void setResearchSchedule(String researchSchedule) {
        this.researchSchedule = researchSchedule == null ? null : researchSchedule.trim();
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference == null ? null : reference.trim();
    }

    public Date getMeetingTime() {
        return meetingTime;
    }

    public void setMeetingTime(Date meetingTime) {
        this.meetingTime = meetingTime;
    }

    public String getMeetingPlace() {
        return meetingPlace;
    }

    public void setMeetingPlace(String meetingPlace) {
        this.meetingPlace = meetingPlace == null ? null : meetingPlace.trim();
    }

    public String getMeetingHost() {
        return meetingHost;
    }

    public void setMeetingHost(String meetingHost) {
        this.meetingHost = meetingHost == null ? null : meetingHost.trim();
    }

    public Integer getTeacher1Id() {
        return teacher1Id;
    }

    public void setTeacher1Id(Integer teacher1Id) {
        this.teacher1Id = teacher1Id;
    }

    public Integer getTeacher2Id() {
        return teacher2Id;
    }

    public void setTeacher2Id(Integer teacher2Id) {
        this.teacher2Id = teacher2Id;
    }

    public Integer getTeacher3Id() {
        return teacher3Id;
    }

    public void setTeacher3Id(Integer teacher3Id) {
        this.teacher3Id = teacher3Id;
    }

    public String getMeetingSummary() {
        return meetingSummary;
    }

    public void setMeetingSummary(String meetingSummary) {
        this.meetingSummary = meetingSummary == null ? null : meetingSummary.trim();
    }

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice == null ? null : advice.trim();
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }
}