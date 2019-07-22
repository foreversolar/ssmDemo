package com.demo.mms.common.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;

public class FinalReport {
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private int reportid;
    private int studentid;
    private String fileaddress;
    private int score1;
    private int score2;
    private int score3;
    private String advice;
    private Date commit_time;
    private String reportname;
    private String state;
    private String keyword;
    private String innovation_point;
    private String chinese_abstract;
    private String english_abstract;
    private String others;
    private String detection_result;
    private String report_address;
    private String result_address;
    private String enclosure_address;
    private int version;
    private String originfilename1;
    private String originfilename2;
    private String originfilename3;

    public void setOriginfilename1(String originfilename1) {
        this.originfilename1 = originfilename1;
    }

    public void setOriginfilename2(String originfilename2) {
        this.originfilename2 = originfilename2;
    }

    public void setOriginfilename3(String originfilename3) {
        this.originfilename3 = originfilename3;
    }

    public String getOriginfilename1() {
        return originfilename1;
    }

    public String getOriginfilename2() {
        return originfilename2;
    }

    public String getOriginfilename3() {
        return originfilename3;
    }

    public void setTeacher_result(String teacher_result) {
        this.teacher_result = teacher_result;
    }

    public String getTeacher_result() {
        return teacher_result;
    }

    private String teacher_result;

    public void setVersion(int version) {
        this.version = version;
    }

    public void setReporid(int reportid) {
        this.reportid = reportid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public void setFileadress(String fileadress) {
        this.fileaddress = fileadress;
    }

    public void setScore1(int score1) {
        this.score1 = score1;
    }

    public void setScore2(int score2) {
        this.score2 = score2;
    }

    public void setScore3(int score3) {
        this.score3 = score3;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }

    public void setComment_time(Date comment_time) {
        this.commit_time = comment_time;
    }

    public void setRpeortname(String rpeortname) {
        this.reportname = rpeortname;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public void setInnovation_point(String innovation_point) {
        this.innovation_point = innovation_point;
    }

    public void setChinese_abstract(String chinese_abstract) {
        this.chinese_abstract = chinese_abstract;
    }

    public void setEnglish_abstract(String english_abstract) {
        this.english_abstract = english_abstract;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    public void setDetection_result(String detection_result) {
        this.detection_result = detection_result;
    }

    public void setReport_adress(String report_adress) {
        this.report_address = report_adress;
    }

    public void setResult_adress(String result_adress) {
        this.result_address = result_adress;
    }

    public void setEnclosure_adress(String enclosure_adress) {
        this.enclosure_address = enclosure_adress;
    }

    public int getReporid() {
        return reportid;
    }

    public int getStudentid() {
        return studentid;
    }

    public String getFileadress() {
        return fileaddress;
    }

    public int getScore1() {
        return score1;
    }

    public int getScore2() {
        return score2;
    }

    public int getScore3() {
        return score3;
    }

    public String getAdvice() {
        return advice;
    }

    public Date getComment_time() {
        return commit_time;
    }

    public String getRpeortname() {
        return reportname;
    }

    public String getState() {
        return state;
    }

    public String getKeyword() {
        return keyword;
    }

    public String getInnovation_point() {
        return innovation_point;
    }

    public String getChinese_abstract() {
        return chinese_abstract;
    }

    public String getEnglish_abstract() {
        return english_abstract;
    }

    public String getOthers() {
        return others;
    }

    public String getDetection_result() {
        return detection_result;
    }

    public String getReport_adress() {
        return report_address;
    }

    public String getResult_adress() {
        return result_address;
    }

    public String getEnclosure_adress() {
        return enclosure_address;
    }

    public int getVersion() {
        return version;
    }
}