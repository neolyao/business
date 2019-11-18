package org.adobe.business.service;

import org.adobe.business.dao.OrderAddressDao;
import org.adobe.business.pojo.OrderAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description: 订单地址业务
 * @author: lxq
 * @create: 2019-11-18 10:20:24
 */
@Service
public class OrderAddressServiceImpl implements OrderAddressService {
    @Autowired
    private OrderAddressDao orderAddressDao;

    @Override
    public List<OrderAddress> find(OrderAddress orderAddress) {
        return orderAddressDao.find(orderAddress);
    }
}