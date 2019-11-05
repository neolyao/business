package org.adobe.business.service;

import org.adobe.business.pojo.Goods;
import org.adobe.business.pojo.Test;

import java.util.List;

public interface TestServie {

    public List<Goods> getGoods();
    public List<Test> getTests();
}
