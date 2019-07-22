package com.demo.mms.common.domain;

import java.util.Date;

public class Translation {
    private Integer id;

    private Integer course_id;

    private String file_address;

    private String state;

    private String advice;

    private Date time;

    private String translation_content;

    private String original_text;

    private int version;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFileAddress() {
        return file_address;
    }

    public void setFileAddress(String file_address) {
        this.file_address = file_address == null ? null : file_address.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
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

    public String getTranslationContent() {
        return translation_content;
    }

    public void setTranslationContent(String translationContent) {
        this.translation_content = translation_content == null ? null : translation_content.trim();
    }

    public String getOriginalText() {
        return original_text;
    }

    public void setOriginalText(String originalText) {
        this.original_text = original_text == null ? null : original_text.trim();
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public Integer getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Integer course_id) {
        this.course_id = course_id;
    }

}