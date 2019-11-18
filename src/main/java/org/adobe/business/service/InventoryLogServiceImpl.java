package org.adobe.business.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.adobe.business.dao.InventoryLogDao;
import org.adobe.business.pojo.InventoryLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @description: 商品库存日志业务
 * @author: lixuqiang
 * @create: 2019-11-8 11:37:02
 */
@Service
public class InventoryLogServiceImpl implements InventoryLogService {
    @Autowired
    private InventoryLogDao inventoryLogDao;

    @Override
    public PageInfo<InventoryLog> page(Integer pageNo, Integer pageSize, String startDateTime, String endDateTime, InventoryLog inventoryLog) {
        PageHelper.startPage(pageNo,pageSize);
        return new PageInfo<InventoryLog>(inventoryLogDao.find(startDateTime,endDateTime,inventoryLog));
    }

    @Override
    public boolean delete(Integer id) {
        Integer num = inventoryLogDao.delete(id);
        if(num==1){
            return true;
        }
        return false;
    }
}