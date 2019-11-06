package org.adobe.business.service;

import org.adobe.business.dao.UserDao;
import org.adobe.business.pojo.Role;
import org.adobe.business.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: business
 * @description: 用户信息服务
 * @author: niyao
 * @create: 2019-11-06 12:53
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public User findByUserName(String name) {
        return userDao.findByUserName(name);
    }

    @Override
    public Role findRolesById(Integer id) {
        return userDao.findRolesById(id);
    }
}