package org.adobe.business.service;


import org.adobe.business.pojo.OrderAddress;

import java.util.List;

public interface OrderAddressService {

    /**
     * 查询订单地址
     * @param orderAddress 订单地址
     * @return 订单地址集合
     */
    List<OrderAddress> find(OrderAddress orderAddress);
}
