package com.demo.mms.service;

import com.demo.mms.common.domain.Translation;
import com.demo.mms.dao.TranslationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    @Override
    public void addTeacherOpinion(String course_id, String advice, String auditStatus) {
        System.out.println("1"+course_id+" "+advice+" "+auditStatus);
        translationMapper.insertTeacherOpinion(course_id,advice,auditStatus);
    }

    @Override
    public void addTranslation1path(String dbpath, String course_id, String version, String originalFilename) {
        translationMapper.insertTranslation1path(dbpath,course_id,version,originalFilename);
    }

    @Override
    public void addTranslation2path(String dbpath, String course_id, String version, String originalFilename) {
        translationMapper.insertTranslation2path(dbpath,course_id,version,originalFilename);
    }

    @Override
    public List<Translation> returnTranslationToTeacher(Integer teacher_id) {
        return translationMapper.returnTranslationToTeacher(teacher_id);
    }


    @Transactional
    @Override
    public Integer getVersion(int course_id){
        return translationMapper.getVersion(course_id );
    }
}


