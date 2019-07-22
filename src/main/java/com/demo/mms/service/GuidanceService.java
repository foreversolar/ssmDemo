package com.demo.mms.service;

import com.demo.mms.common.domain.Guidance;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface GuidanceService {
    @Transactional
    void addGuidance(Guidance guidance);
    Guidance getGuidance(Integer course_id, int version);
    List<Guidance> selectGuidances(Integer course_id);

    void addTeacherOpinion(String toString, String advice, String auditStatus);
}
