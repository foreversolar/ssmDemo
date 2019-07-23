package com.demo.mms.service;

import com.demo.mms.common.domain.Task;
import org.springframework.transaction.annotation.Transactional;

public interface TaskService {
    @Transactional
    void addTask(Task task);

    Task getTask(Integer course_id);
}
