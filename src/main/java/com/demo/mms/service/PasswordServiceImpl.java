package com.demo.mms.service;

import com.demo.mms.dao.OpenReportMapper;
import com.demo.mms.dao.PasswordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PasswordServiceImpl implements PasswordService{
    @Autowired
    PasswordMapper passwordMapper;
    @Override
    public void resetPassword(String mail, String newPassword) {
        passwordMapper.resetPassword1(mail,newPassword);
        passwordMapper.resetPassword2(mail,newPassword);
    }
}
