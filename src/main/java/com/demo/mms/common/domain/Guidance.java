package com.demo.mms.common.domain;

import java.util.Date;

public class Guidance {
    private Integer id;

    private Integer courseId;

    private Date time;

    private String content;

    private Integer version;

    private Date submitTime;

    private String result;

    private String advice;

    public void setResult(String result) {
        this.result = result;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }

    public String getResult() {
        return result;
    }

    public String getAdvice() {
        return advice;
    }

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

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }
}