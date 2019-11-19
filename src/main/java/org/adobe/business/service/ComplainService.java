package org.adobe.business.service;


import com.github.pagehelper.PageInfo;
import org.adobe.business.pojo.Complain;

public interface ComplainService {

    //分页查询
    PageInfo<Complain> page(Integer pageNo, Integer pageSize, Complain complain);

    //删除
    boolean delete(Integer id);
}
