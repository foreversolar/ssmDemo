package com.demo.mms.dao;

import com.demo.mms.common.domain.Selectcourse;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SelectcourseMapper {
    int deleteByPrimaryKey(Integer courseId);

    int insert(Selectcourse record);

    int insertSelective(Selectcourse record);

    Selectcourse selectByPrimaryKey(Integer courseId);

    int updateByPrimaryKeySelective(Selectcourse record);

    int updateByPrimaryKey(Selectcourse record);

    Selectcourse selectSelectcourse(@Param("course_id") int course_id);

    List<Selectcourse> getSelectcourse(Integer course_id);
}