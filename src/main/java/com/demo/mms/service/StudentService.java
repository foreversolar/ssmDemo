package com.demo.mms.service;

import com.demo.mms.common.domain.Student;

import java.util.List;

public interface StudentService {

    boolean checkUserName(int usr);

    boolean checkUsrANDPwd(int usr, String pwd);

    Student getStudent(int stdId);
}
