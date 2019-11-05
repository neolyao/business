package org.adobe.business.controller;

import org.adobe.business.pojo.Goods;
import org.adobe.business.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: business
 * @description: 商品功能
 * @author: niyao
 * @create: 2019-11-05 14:22
 */
@RestController
public class GoodsController {
    @Autowired
    private GoodsService goodsService;
    @RequestMapping("/getGoods")
    public List<Goods> getGoods(){
        return goodsService.getGoods();
    }
}