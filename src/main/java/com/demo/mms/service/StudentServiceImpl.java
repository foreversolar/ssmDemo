package com.demo.mms.service;

import com.demo.mms.common.domain.Student;
import com.demo.mms.dao.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public boolean checkUserName(int usr){
        return (null!=studentMapper.selectByPrimaryKey(usr));
    }

    @Override
    public boolean checkUsrANDPwd(int usr,String pwd){
        Student temp=studentMapper.selectByPrimaryKey(usr);
        return pwd==temp.getPassword();
    }

    @Override
    public Student getStudent(int stdId){ return studentMapper.selectByPrimaryKey(stdId); };

}
