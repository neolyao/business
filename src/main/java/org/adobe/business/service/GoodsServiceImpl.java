package org.adobe.business.service;

import org.adobe.business.dao.GoodsDao;
import org.adobe.business.pojo.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: business
 * @description: 商品业务
 * @author: niyao
 * @create: 2019-11-05 14:27
 */
@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsDao    goodsDao;
    @Override
    public List<Goods> getGoods() {
        return goodsDao.getGoods();
    }

    /**
     * 根据id 查询商品
     * @param id
     * @return
     */
    @Override
    public Goods findGoodsById(Integer id) {
        return goodsDao.findGoodsById(id);
    }

    /**
     * 根据名称模糊查询
     * @param name
     * @return
     */
    @Override
    public List<Goods> findGoodsByName(String name) {
        return goodsDao.findGoodsByName(name);
    }

    /**
     * 添加商品
     * @param goods
     */
    @Override
    public void addGoods(Goods goods) {
            goodsDao.addGoods(goods);
    }

    /**
     * 删除商品
     * @param id
     */
    @Override
    public void deleteGoodsById(Integer id) {
            goodsDao.deleteGoodsById(id);
    }

    /**
     * 更新商品
     * @param goods
     */
    @Override
    public void updateGoods(Goods goods) {
            goodsDao.updateGoods(goods);
    }

    /**
     * 根据存放区查询商品
     * @param repo
     * @return
     */
    @Override
    public List<Goods> findGoodsByRepo(String repo) {
        return goodsDao.findGoodsByRepo(repo);
    }
}