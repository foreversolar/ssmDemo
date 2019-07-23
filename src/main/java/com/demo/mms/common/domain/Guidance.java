package com.demo.mms.common.domain;

import java.util.Date;

public class Guidance {
    private Integer id;

    private Integer course_id;

    private Date time;

    private String content;

    private Integer version;

    private Date submit_time;

    private String state;

    private String result;

    private String advice;

    private String path;

    public Date getSubmit_time() {
        return submit_time;
    }

    public void setSubmit_time(Date submit_time) {
        this.submit_time = submit_time;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getOriginfilename() {
        return originfilename;
    }

    public void setOriginfilename(String originfilename) {
        this.originfilename = originfilename;
    }

    private String originfilename;

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

    public Integer getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Integer course_id) {
        this.course_id = course_id;
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

}