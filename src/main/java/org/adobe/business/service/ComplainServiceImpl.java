package org.adobe.business.service;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.adobe.business.dao.ComplainDao;
import org.adobe.business.pojo.Complain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComplainServiceImpl implements ComplainService {
    @Autowired
    private ComplainDao complainDao;

    @Override
    public PageInfo<Complain> page(Integer pageNo, Integer pageSize, Complain complain) {
        PageHelper.startPage(pageNo,pageSize);
        return new PageInfo<Complain>(complainDao.find(complain));
    }
}
