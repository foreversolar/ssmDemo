package com.demo.mms.service;

import com.demo.mms.common.domain.Teacher;

public interface TeacherService {
    boolean checkUserName(int usr);

    boolean checkUsrANDPwd(int usr, String pwd);

    Teacher getTeacher(int stdId);
}
