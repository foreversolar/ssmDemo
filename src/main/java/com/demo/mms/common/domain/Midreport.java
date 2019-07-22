package com.demo.mms.common.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;


public class Midreport {
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private int id;
    private int course_id;
    private String state;

    private String translation_complete;
    private String translation_progress;
    private Date translation_time;
    private String translation_comment;

    private String paper_complete;
    private String paper_progress;
    private Date paper_time;
    private String paper_comment;

    private String experiment_complete;
    private String experiment_progress;
    private Date experiment_time;
    private String experiment_comment;

    private String project_progress;
    private Date project_time;

    private String advice;
    private int version;
    private String path;
    private String originfilename;
    private String result;

    public void setResult(String result) {
        this.result = result;
    }

    public String getResult() {
        return result;
    }

    public void setOriginfilename(String originfilename) {
        this.originfilename = originfilename;
    }

    public String getOriginfilename() {
        return originfilename;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setTranslation_complete(String translation_complete) {
        this.translation_complete = translation_complete;
    }

    public void setTranslation_progress(String translation_progress) {
        this.translation_progress = translation_progress;
    }

    public void setTranslation_comment(String translation_comment) {
        this.translation_comment = translation_comment;
    }

    public void setPaper_complete(String paper_complete) {
        this.paper_complete = paper_complete;
    }

    public void setPaper_progress(String paper_progress) {
        this.paper_progress = paper_progress;
    }

    public void setPaper_comment(String paper_comment) {
        this.paper_comment = paper_comment;
    }

    public void setExperiment_complete(String experiment_complete) {
        this.experiment_complete = experiment_complete;
    }

    public void setExperiment_progress(String experiment_progress) {
        this.experiment_progress = experiment_progress;
    }

    public void setExperiment_comment(String experiment_comment) {
        this.experiment_comment = experiment_comment;
    }

    public void setProject_progress(String project_progress) {
        this.project_progress = project_progress;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }

    public void setTranslation_time(Date translation_time) {
        this.translation_time = translation_time;
    }

    public void setPaper_time(Date paper_time) {
        this.paper_time = paper_time;
    }

    public void setExperiment_time(Date experiment_time) {
        this.experiment_time = experiment_time;
    }

    public void setProject_time(Date project_time) {
        this.project_time = project_time;
    }

    public int getId() {
        return id;
    }

    public int getCourse_id() {
        return course_id;
    }

    public String getState() {
        return state;
    }

    public String getTranslation_complete() {
        return translation_complete;
    }

    public String getTranslation_progress() {
        return translation_progress;
    }

    public String getTranslation_comment() {
        return translation_comment;
    }

    public String getPaper_complete() {
        return paper_complete;
    }

    public String getPaper_progress() {
        return paper_progress;
    }

    public String getPaper_comment() {
        return paper_comment;
    }

    public String getExperiment_complete() {
        return experiment_complete;
    }

    public String getExperiment_progress() {
        return experiment_progress;
    }

    public String getExperiment_comment() {
        return experiment_comment;
    }

    public String getProject_progress() {
        return project_progress;
    }

    public String getAdvice() {
        return advice;
    }

    public Date getTranslation_time() {
        return translation_time;
    }

    public Date getPaper_time() {
        return paper_time;
    }

    public Date getExperiment_time() {
        return experiment_time;
    }

    public Date getProject_time() {
        return project_time;
    }

    public int getVersion() {
        return version;
    }

    public String getPath() {
        return path;
    }
}
