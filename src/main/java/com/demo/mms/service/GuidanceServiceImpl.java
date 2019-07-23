package com.demo.mms.service;

import com.demo.mms.common.domain.Guidance;
import com.demo.mms.dao.GuidanceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GuidanceServiceImpl implements GuidanceService{
    @Autowired
    GuidanceMapper guidanceMapper;

    @Transactional
    @Override
    public void addGuidance(Guidance guidance) {
        guidanceMapper.insert(guidance);
    }

    @Override
    public Guidance getGuidance(Integer course_id){
//        int max_version=guidanceMapper.selectMaxVersion(course_id);
//        System.out.println(max_version);
        Guidance hellokitty=guidanceMapper.selectGuidance(course_id);
//        System.out.println(hellokitty.getCurrentOverview());
        return hellokitty;
    }
    @Override
    public  List<Guidance> selectGuidances(Integer course_id){
        List<Guidance> temp=guidanceMapper.getGuidances(course_id);
        System.out.println(temp.size());
        return temp;
    }

    @Override
    public void addTeacherOpinion(String course_id, String advice, String auditStatus) {
        guidanceMapper.insertTeacherOpinion(course_id,advice,auditStatus);
    }

    @Override
    public Integer addMaxversion(Integer course_id) {
        return guidanceMapper.selectMaxversion(course_id);
    }

    @Override
    public void addMidrepcortpath(String dbpath, String course_id, String version, String originalFilename) {
        System.out.println(dbpath+"  "+course_id+"  "+version+"  "+originalFilename);
        guidanceMapper.insertGuidancepath(dbpath,course_id,version,originalFilename);
    }

    /*
    int selectMaxVersion(Integer course_id);

    Guidance selectGuidance(Integer course_id, int max_version);*/
}
