package org.adobe.business.service;

import org.adobe.business.dao.TestDao;
import org.adobe.business.pojo.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImp implements TestServie{
    @Autowired
    private TestDao testDao;
    @Override
    public List<Test> getTests(){
        return testDao.getTests();
    }
}
