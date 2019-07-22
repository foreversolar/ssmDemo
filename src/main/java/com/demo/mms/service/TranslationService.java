package com.demo.mms.service;

import com.demo.mms.common.domain.Translation;

public interface TranslationService {
    void  addTranslation(Translation translation);
    Integer getVersion(int course_id);
    Translation findTranslation(int course_id, int version);
}

