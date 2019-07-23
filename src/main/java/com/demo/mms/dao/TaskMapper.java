package com.demo.mms.dao;

import com.demo.mms.common.domain.Task;
import org.apache.ibatis.annotations.Param;

public interface TaskMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Task record);

    int insertSelective(Task record);

    Task selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Task record);

    int updateByPrimaryKey(Task record);

    int selectMaxVersion(Integer course_id);

    Task selectTask(@Param("course_id") Integer course_id, @Param("version") Integer version);
}