package org.adobe.business.dao;


import org.adobe.business.pojo.Complain;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ComplainDao {

    List<Complain> find(@Param("complain") Complain complain);
}
