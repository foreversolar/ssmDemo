package com.demo.mms.common.domain;

import java.util.Date;

public class LiteratureReview {
    private Integer id;

    private Integer courseId;

    private String content;

    private String state;

    private Integer version;

    private String advice;

    private String attachmentAddress;

    private Date time;

    private String result;

    public void setResult(String result) {
        this.result = result;
    }

    public String getResult() {
        return result;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice == null ? null : advice.trim();
    }

    public String getAttachmentAddress() {
        return attachmentAddress;
    }

    public void setAttachmentAddress(String attachmentAddress) {
        this.attachmentAddress = attachmentAddress == null ? null : attachmentAddress.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}