package com.demo.mms.dao;

import org.apache.ibatis.annotations.Param;

public interface PasswordMapper {
    void resetPassword1(@Param("mail") String  mail, @Param("newPassword") String newPassword);
    void resetPassword2(@Param("mail") String  mail, @Param("newPassword") String newPassword);
}
