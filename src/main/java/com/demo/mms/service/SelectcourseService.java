package com.demo.mms.service;

import com.demo.mms.common.domain.Selectcourse;

public interface SelectcourseService {
    void addSelectcourse(Selectcourse selectcourse);
    Selectcourse getSelectcourse(Integer course_id);
}

