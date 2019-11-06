package org.adobe.business.service;

import org.adobe.business.pojo.Role;
import org.adobe.business.pojo.User;

/**
 * 用户信息接口
 */
public interface UserService {
     User findByUserName(String name);
     Role findRolesById(Integer id);
}
