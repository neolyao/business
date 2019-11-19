package org.adobe.business.service;

import org.adobe.business.dao.OrderDao;
import org.adobe.business.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @program: business
 * @description: 订单列表
 * @author: wangxuesong
 * @create: 2019-11-08 9:00
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao OrderDao;
    @Override
    public List<Order> getOrderList(int brandid) {
        return OrderDao.getOrderList(brandid);
    }

    @Override
    public Order getOrder(int orderId) {
        return OrderDao.getOrder(orderId);
    }

}
