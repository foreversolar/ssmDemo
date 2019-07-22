package com.demo.mms.common.domain;

public class Selectcourse {
    private Integer courseId;

    private Integer teacherId;

    private String teacherName;

    private String courseType;

    private String courseSource;

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType == null ? null : courseType.trim();
    }

    public String getCourseSource() {
        return courseSource;
    }

    public void setCourseSource(String courseSource) {
        this.courseSource = courseSource == null ? null : courseSource.trim();
    }
}