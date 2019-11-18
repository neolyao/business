package org.adobe.business.controller;

import org.adobe.business.pojo.OrderAddress;
import org.adobe.business.service.OrderAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description: 订单地址功能
 * @author: lxq
 * @create: 2019-11-18 10:21:42
 */
@RestController
@RequestMapping("/orderAddress")
public class OrderAddressController {
    @Autowired
    private OrderAddressService orderAddressService;

    /**
     * 查询订单
     * @param orderAddress 订单对象
     * @return 多个订单
     */
    @RequestMapping("/find")
    public List<OrderAddress> find(OrderAddress orderAddress){
        List<OrderAddress> orderAddresses =orderAddressService.find(orderAddress);
        OrderAddress orderAddress1 = new OrderAddress();
        orderAddress1.setId(-1);
        orderAddress1.setName("请选择...");
        orderAddresses.add(0,orderAddress1);
        return orderAddresses;
    }

}