package org.adobe.business.service;

import org.adobe.business.pojo.Goods;

import java.util.List;
public interface GoodsService {
    List<Goods> getGoods();
    Goods findGoodsById(Integer id);
    List<Goods> findGoodsByName(String name);
    void addGoods(Goods goods);
    void deleteGoodsById(Integer id);
    void updateGoods(Goods goods);
    List<Goods> findGoodsByRepo(String repo);
}
