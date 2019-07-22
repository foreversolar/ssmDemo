package com.demo.mms.common.domain;

public class AddedCourse {
    private int course_id;
    private String course_name;
    private String course_type;
    private String course_overview;
    private String course_goal;
    private String teacher_result;


    private String state;
    private String professional_person_result;

    public void setTeacher_result(String teacher_result) {
        this.teacher_result = teacher_result;
    }

    public void setProfessional_person_result(String professional_person_result) {
        this.professional_person_result = professional_person_result;
    }

    public String getTeacher_result() {
        return teacher_result;
    }

    public String getProfessional_person_result() {
        return professional_person_result;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public void setCourse_type(String course_type) {
        this.course_type = course_type;
    }

    public void setCourse_overview(String course_overview) {
        this.course_overview = course_overview;
    }

    public void setCourse_goal(String course_goal) {
        this.course_goal = course_goal;
    }

    public int getCourse_id() {
        return course_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public String getCourse_type() {
        return course_type;
    }

    public String getCourse_overview() {
        return course_overview;
    }

    public String getCourse_goal() {
        return course_goal;
    }
}
