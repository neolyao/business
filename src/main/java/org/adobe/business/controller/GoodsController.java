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
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    /**
     * @param page 分页信息
     * @return 返回分页信息和商品
     */
    @RequestMapping(value = "/getGoods",method = RequestMethod.GET)
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
    /**
     * 根据ID删除
     * @param id 商品id
     */
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public void deleteGoodsById(@PathVariable("id") Integer id){
        goodsService.deleteGoodsById(id);
    }

    /**
     *
     * @param goods 商品信息
     */
    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public void updateGoods(Goods goods){
        goodsService.updateGoods(goods);
    }
    /**
     * 根据id 查询
     * @param id 商品id
     * @return
     */
    @RequestMapping("/goods/{id}")
    public Goods getGoodsById(@PathVariable("id") Integer id){
        return goodsService.findGoodsById(id);
    }

    /**
     * 添加商品
     * @param goods
     */
    @RequestMapping("/add")
    public void addGoods(Goods goods){
        goodsService.addGoods(goods);
    }

    /**
     * 根据商品库查询
     * @param repo
     * @param page
     * @return
     */
    @RequestMapping("/repo/{repo}")
    public Map<String,Object> getGoodsByRepo(@PathVariable("repo")String repo,@RequestBody Page page){
        PageHelper.startPage(page.getCurrentPage(),page.getPageSize());
        List<Goods> goodsList=goodsService.findGoodsByRepo(repo);
        PageInfo<Goods> pageInfo=new PageInfo<>(goodsList);
        Map<String,Object> map=new HashMap<>();
        map.put("total",pageInfo.getTotal());
        map.put("list",goodsList);
        System.out.println(page);
        return map;
    }
}