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
}