package org.adobe.business.controller;

import com.github.pagehelper.PageInfo;
import org.adobe.business.pojo.InventoryLog;
import org.adobe.business.service.InventoryLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



/**
 * @description: 商品库存日志功能
 * @author: lixuqiang
 * @create: 2019-11-8 11:38:04
 */
@RestController
public class InventoryLogController {
    @Autowired
    private InventoryLogService inventoryLogService;

    @RequestMapping("/inventoryLog/page")
    public PageInfo<InventoryLog> page(@RequestParam(defaultValue = "1") Integer pageNo,
                                       @RequestParam(defaultValue = "10") Integer pageSize,
                                       InventoryLog inventoryLog){
        return inventoryLogService.page(pageNo,pageSize,inventoryLog);
    }

}