package org.adobe.business.dao;

import org.adobe.business.pojo.Goods;

import java.util.List;

public interface GoodsDao {
     List<Goods> getGoods();
     Goods findGoodsById(Integer id);
     List<Goods> findGoodsByName(String name);
     void addGoods(Goods goods);
     void deleteGoodsById(Integer id);
     void updateGoods(Goods goods);
}
