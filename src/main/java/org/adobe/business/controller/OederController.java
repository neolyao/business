package org.adobe.business.controller;

import org.adobe.business.pojo.Order;
import org.adobe.business.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: business
 * @description: 订单列表
 * @author: wangxuesong
 * @create: 2019-11-08 9:00
 */
@RestController
public class OederController {
    @Autowired
   private OrderService orderService;
    @RequestMapping(value = "/getOrderList",method = RequestMethod.GET)
    public List<Order> getOrderList(){
        //店铺id
        int brandid=1;
        //
       return orderService.getOrderList(brandid);
    }
    @RequestMapping(value = "/getOrder",method = RequestMethod.GET)
    public Order getOrder(){

        //订单id
        int orderId=1;
        //
        return orderService.getOrder(orderId);
    }
}
