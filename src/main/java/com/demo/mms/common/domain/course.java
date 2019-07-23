package com.demo.mms.common.domain;

import java.util.Date;

public class course {
    private Integer id;

    private String title;

    private String avail_major;

    private String mode;

    private String type;

    private String attach_major;

    private String instructor;

    private Integer instId;

    private String student;

    public Integer getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }

    private Integer student_id;

    private String instEmail;

    private String stu_major;

    private Date declareTime;

    private String resource;

    private String state;

    private String teaTitle;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getAvailMajor() {
        return avail_major;
    }

    public void setAvailMajor(String availMajor) {
        this.avail_major = availMajor == null ? null : availMajor.trim();
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode == null ? null : mode.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getAttachMajor() {
        return attach_major;
    }

    public void setAttachMajor(String attachMajor) {
        this.attach_major = attachMajor == null ? null : attachMajor.trim();
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor == null ? null : instructor.trim();
    }

    public Integer getInstId() {
        return instId;
    }

    public void setInstId(Integer instId) {
        this.instId = instId;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student == null ? null : student.trim();
    }


    public String getInstEmail() {
        return instEmail;
    }

    public void setInstEmail(String instEmail) {
        this.instEmail = instEmail == null ? null : instEmail.trim();
    }

    public String getStuMajor() {
        return stu_major;
    }

    public void setStuMajor(String stuMajor) {
        this.stu_major = stuMajor == null ? null : stuMajor.trim();
    }

    public Date getDeclareTime() {
        return declareTime;
    }

    public void setDeclareTime(Date declareTime) {
        this.declareTime = declareTime;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource == null ? null : resource.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getTeaTitle() {
        return teaTitle;
    }

    public void setTeaTitle(String teaTitle) {
        this.teaTitle = teaTitle == null ? null : teaTitle.trim();
    }
}