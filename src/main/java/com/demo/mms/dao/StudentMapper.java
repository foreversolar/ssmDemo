package com.demo.mms.dao;

import com.demo.mms.common.domain.Student;
import org.apache.ibatis.annotations.Param;

public interface StudentMapper {
    int deleteByPrimaryKey(Integer studentId);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer studentId);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    int checkIDNum(@Param("student_id") int student_id,@Param("idnum") int idnum);

    void updatePassword(@Param("usr") String usr,@Param("newPwd") String newPwd);

//    int check(@Param("student_id") Integer student_id, @Param("password") String password);
}