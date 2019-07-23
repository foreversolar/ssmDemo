package com.demo.mms.common.domain;

import java.util.Date;

public class Translation {
    private Integer id;

    private Integer course_id;

    private String file_address1;

    private String state;

    private String advice;

    private Date time;

    private String translation_content;

    private int version;

    private String result;

    private String original_text;

    private String file_address2;

    public String getTranslation_content() {
        return translation_content;
    }

    public void setTranslation_content(String translation_content) {
        this.translation_content = translation_content;
    }

    public String getOriginal_text() {
        return original_text;
    }

    public void setOriginal_text(String original_text) {
        this.original_text = original_text;
    }

    public String getFile_address1() {
        return file_address1;
    }

    public void setFile_address1(String file_address1) {
        this.file_address1 = file_address1;
    }

    public String getFile_address2() {
        return file_address2;
    }

    public void setFile_address2(String file_address2) {
        this.file_address2 = file_address2;
    }

    public String getOriginfilename1() {
        return originfilename1;
    }

    public void setOriginfilename1(String originfilename1) {
        this.originfilename1 = originfilename1;
    }

    public String getOriginfilename2() {
        return originfilename2;
    }

    public void setOriginfilename2(String originfilename2) {
        this.originfilename2 = originfilename2;
    }

    private String originfilename1;

    private String originfilename2;

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