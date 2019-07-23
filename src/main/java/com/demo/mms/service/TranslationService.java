package com.demo.mms.service;

import com.demo.mms.common.domain.Translation;

public interface TranslationService {
    void  addTranslation(Translation translation);
    Integer getVersion(int course_id);
    Translation findTranslation(int course_id, int version);

    void addTeacherOpinion(String course_id, String advice, String auditStatus);

    void addTranslation1path(String dbpath, String course_id, String version, String originalFilename);

    void addTranslation2path(String dbpath, String course_id, String version, String originalFilename);
}

