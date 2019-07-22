package com.demo.mms.service;

import com.demo.mms.common.domain.Teacher;
import com.demo.mms.dao.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public boolean checkUserName(int usr){
        return (null!=teacherMapper.selectByPrimaryKey(usr));
    }

    @Override
    public boolean checkUsrANDPwd(int usr,String pwd){
        Teacher temp=teacherMapper.selectByPrimaryKey(usr);
        return pwd.equals(temp.getPassword());
    }

    @Override
    public Teacher getTeacher(int stdId){ return teacherMapper.selectByPrimaryKey(stdId); };

}
