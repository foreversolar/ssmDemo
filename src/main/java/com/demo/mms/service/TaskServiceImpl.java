package com.demo.mms.service;

import com.demo.mms.common.domain.Task;
import com.demo.mms.dao.TaskMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TaskServiceImpl implements TaskService{
    @Autowired
    TaskMapper taskMapper;

    @Transactional
    @Override
    public void addTask(Task task) {
        taskMapper.insert(task);
    }

    @Override
    public Task getTask(Integer course_id){
        int max_version=taskMapper.selectMaxVersion(course_id);
//        System.out.println(max_version);
        Task hellokitty=taskMapper.selectTask(course_id,max_version);
//        System.out.println(hellokitty.getCurrentOverview());
        return hellokitty;
    }
}
