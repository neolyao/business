package org.adobe.business.controller;

import com.github.pagehelper.PageInfo;
import org.adobe.business.pojo.InventoryLog;
import org.adobe.business.service.InventoryLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


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
                                       String startDateTime,
                                       String endDateTime,
                                       InventoryLog inventoryLog){
        return inventoryLogService.page(pageNo,pageSize,startDateTime,endDateTime,inventoryLog);
    }

    @RequestMapping("/inventoryLog/findType")
    public List<Map<String,String>> findType(){
        List list = new ArrayList();
        Map<String,String> map1 = new HashMap<>();
        map1.put("value","测试1");
        map1.put("key","1");
        list.add(map1);
        Map<String,String> map2 = new HashMap<>();
        map2.put("value","测试2");
        map2.put("key","2");
        list.add(map2);
        Map<String,String> map3 = new HashMap<>();
        map3.put("value","测试3");
        map3.put("key","3");
        list.add(map3);
        Map<String,String> map4 = new HashMap<>();
        map4.put("value","测试4");
        map4.put("key","4");
        list.add(map4);
        Map<String,String> map5 = new HashMap<>();
        map5.put("value","测试5");
        map5.put("key","5");
        list.add(map5);
        return list;
    }

}