package com.demo.mms.service;

import com.demo.mms.common.domain.Selectcourse;

public interface PasswordService {
    void resetPassword(String mail,String newPassword);
}
