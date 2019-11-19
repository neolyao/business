package org.adobe.business.dao;

import org.adobe.business.pojo.Order;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface OrderDao {
    List<Order> getOrderList(@Param("brandid") int brandid);

    Order getOrder(@Param("orderId") int orderId);
}
