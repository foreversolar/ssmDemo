package com.demo.mms.service;

import com.demo.mms.common.domain.Translation;
import com.demo.mms.dao.TranslationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TranslationServiceImpl implements TranslationService{
    @Autowired
    TranslationMapper translationMapper;
    @Transactional
    @Override
    public void addTranslation(Translation translation){
        translationMapper.insertTranslation(translation);
    }
    @Transactional
    @Override
    public Translation findTranslation(int course_id,int version){
        return translationMapper.selectTranslation(course_id ,version);
    }
    @Transactional
    @Override
    public Integer getVersion(int course_id){
        System.out.println("2:"+course_id);
        return translationMapper.getVersion(course_id );
    }
}


