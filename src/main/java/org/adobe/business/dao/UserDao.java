package org.adobe.business.dao;

import org.adobe.business.pojo.Role;
import org.adobe.business.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
     User findByUserName(String name);
     Role findRolesById( Integer id);
}
