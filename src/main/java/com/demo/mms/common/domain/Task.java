package com.demo.mms.common.domain;

import java.util.Date;

public class Task {
    private Integer id;

    private Integer courseId;

    private String experimental;

    private String workingtask;

    private String collection;

    private String plan;

    private Integer version;

    private String state;

    private Date submitTime;

    private String result;

    private String advice;

    private String path;

    private String originfilename;

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

    public String getExperimental() {
        return experimental;
    }

    public void setExperimental(String experimental) {
        this.experimental = experimental == null ? null : experimental.trim();
    }

    public String getWorkingtask() {
        return workingtask;
    }

    public void setWorkingtask(String workingtask) {
        this.workingtask = workingtask == null ? null : workingtask.trim();
    }

    public String getCollection() {
        return collection;
    }

    public void setCollection(String collection) {
        this.collection = collection == null ? null : collection.trim();
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan == null ? null : plan.trim();
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

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice == null ? null : advice.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public String getOriginfilename() {
        return originfilename;
    }

    public void setOriginfilename(String originfilename) {
        this.originfilename = originfilename == null ? null : originfilename.trim();
    }
}