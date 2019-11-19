package org.adobe.business.service;

import org.adobe.business.pojo.Order;

import java.util.List;
/**
 * @program: business
 * @description: 订单列表
 * @author: wangxuesong
 * @create: 2019-11-08 9:00
 */
public interface OrderService {
    List<Order> getOrderList(int brandid);

    Order getOrder(int orderId);
}
