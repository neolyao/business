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
 * @author: lxq
 * @create: 2019-11-8 11:38:04
 */
@RestController
@RequestMapping("/inventoryLog")
public class InventoryLogController {
    @Autowired
    private InventoryLogService inventoryLogService;

    /**
     * 分页查询
     * @param pageNo 页码
     * @param pageSize 页大小
     * @param startDateTime 开始时间
     * @param endDateTime 结束时间
     * @param inventoryLog 商品库存日志
     * @return 商品库存日志分页集合
     */
    @RequestMapping("/page")
    public PageInfo<InventoryLog> page(@RequestParam(defaultValue = "1") Integer pageNo,
                                       @RequestParam(defaultValue = "10") Integer pageSize,
                                       String startDateTime,
                                       String endDateTime,
                                       InventoryLog inventoryLog){
        return inventoryLogService.page(pageNo,pageSize,startDateTime,endDateTime,inventoryLog);
    }

    /**
     * 删除多个
     * @param id 商品库存日志id
     * @return 是否成功
     */
    @RequestMapping("/deletes")
    public boolean deletes(String id){
        String[] ids =id.split(",");
        boolean deleteStatic;
        for (String deleteId : ids){
            deleteStatic =inventoryLogService.delete(Integer.valueOf(deleteId));
            if(!deleteStatic){
                return false;
            }
        }
        return true;
    }

}