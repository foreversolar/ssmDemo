package com.demo.mms.service;

import com.demo.mms.common.domain.Selectcourse;
import com.demo.mms.dao.SelectcourseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class SelectcourseServiceImpl implements SelectcourseService {
    @Autowired
    SelectcourseMapper selectcourseMapper;

    @Transactional
    @Override
    public void addSelectcourse(Selectcourse selectcourse){
        selectcourseMapper.insert(selectcourse);
    }

    @Transactional
    @Override
    public Selectcourse getSelectcourse(Integer course_id){
       return selectcourseMapper.selectSelectcourse(course_id);
    }
}



