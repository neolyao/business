package org.adobe.business.dao;


import org.adobe.business.pojo.OrderAddress;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderAddressDao {

     List<OrderAddress> find(@Param("orderAddress") OrderAddress orderAddress);

}
