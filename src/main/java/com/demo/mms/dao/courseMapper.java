package com.demo.mms.dao;

import com.demo.mms.common.domain.course;

import java.util.List;

public interface courseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(course record);

    int insertSelective(course record);

    course selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(course record);

    int updateByPrimaryKey(course record);

    course selecourse(int course_id);

    void insertcourse(course course);

    List<course> getCourseByTeacherId(int inst_id);
}