package com.demo.mms.service;

import com.demo.mms.common.domain.course;

import java.util.List;

public interface courseService {
    void addCourse(course course);
     course findcourse(int course_id);

    List<course> getCourseByTeacherId(int inst_id);
}

