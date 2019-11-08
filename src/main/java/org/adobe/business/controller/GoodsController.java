package org.adobe.business.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.adobe.business.pojo.Goods;
import org.adobe.business.pojo.Page;
import org.adobe.business.pojo.User;
import org.adobe.business.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    /**
     *
     * @param page
     * @return
     */
    @RequestMapping("/getGoods")
    public Map<String,Object> getGoods(@RequestBody Page page){
        PageHelper.startPage(page.getCurrentPage(),page.getPageSize());
        List<Goods> goodsList=goodsService.getGoods();
        PageInfo<Goods> pageInfo=new PageInfo<>(goodsList);
        Map<String,Object> map=new HashMap<>();
        map.put("total",pageInfo.getTotal());
        map.put("list",goodsList);
        System.out.println(page);
        return map;
    }

    /**
     *
     * @param id
     * @return
     */
    @RequestMapping("/goods/{id}")
    public Goods getGoodsById(@PathVariable("id") Integer id){
        return goodsService.findGoodsById(id);
    }

        /**
         *
         * @param keyword
         * @param page
         * @return
         */
        @RequestMapping("/search/{keyword}")
        public Map<String,Object> seachGoods(@PathVariable("keyword") String keyword,@RequestBody Page page){
            PageHelper.startPage(page.getCurrentPage(),page.getPageSize());
            List<Goods> goodsList=goodsService.findGoodsByName(keyword);
            PageInfo<Goods> pageInfo=new PageInfo<>(goodsList);
            Map<String,Object> map=new HashMap<>();
            map.put("total",pageInfo.getTotal());
            map.put("list",goodsList);
            System.out.println(page);
            return map;
        }
}