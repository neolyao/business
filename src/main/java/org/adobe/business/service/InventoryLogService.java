package org.adobe.business.service;


import com.github.pagehelper.PageInfo;
import org.adobe.business.pojo.InventoryLog;

public interface InventoryLogService {

    //分页查询
    PageInfo<InventoryLog> page(Integer pageNo, Integer pageSize,String startDateTime,String endDateTime, InventoryLog inventoryLog);
}
