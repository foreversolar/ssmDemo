package com.demo.mms.common;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @Author: ltc
 * @Date: 2019/7/23 9:59
 */
public class Main {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://148.70.125.144:3306/xxq?useUnicode=true&characterEncoding=utf8&zeroDateTimeBehavior=convertToNull";
        System.out.println(DriverManager.getConnection(url,"team","team123") );

    }
}
