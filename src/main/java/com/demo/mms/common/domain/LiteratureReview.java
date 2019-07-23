package com.demo.mms.common.domain;

import java.util.Date;

public class LiteratureReview {
    private Integer id;

    public Integer getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Integer course_id) {
        this.course_id = course_id;
    }

    private Integer course_id;

    private String content;

    private String state;

    private Integer version;

    private String advice;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    private String path;

    private Date time;


    private String result;

    public String getOriginfilename() {
        return originfilename;
    }

    public void setOriginfilename(String originfilename) {
        this.originfilename = originfilename;
    }

    private  String originfilename;

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


    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}