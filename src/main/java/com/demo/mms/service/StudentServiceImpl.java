package com.demo.mms.service;

import com.demo.mms.common.domain.Student;
import com.demo.mms.dao.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

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
        return pwd.equals(studentMapper.selectByPrimaryKey(usr).getPassword());
    }

    @Override
    public Student getStudent(int stdId){ return studentMapper.selectByPrimaryKey(stdId); }

    @Override
    public boolean checkIDNum(int usr, int idNum) { return (1==studentMapper.checkIDNum(usr,idNum))?(true):(false); }

    @Override
    public boolean changePassword(Integer usr,String newPwd) {
        studentMapper.updatePassword(usr.toString(),newPwd);
        return this.checkUsrANDPwd(usr,newPwd);
    }

    ;

}
