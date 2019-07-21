package com.demo.mms.service;
import com.demo.mms.common.domain.*;
import org.springframework.transaction.annotation.Transactional;

public interface OpenReportService {
    @Transactional
    void addOpenReport(OpenReport openReport);
    OpenReport getOpenreport(Integer course_id);
}
