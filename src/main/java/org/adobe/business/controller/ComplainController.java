package org.adobe.business.controller;

import com.github.pagehelper.PageInfo;
import org.adobe.business.pojo.Complain;
import org.adobe.business.service.ComplainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @description: 投诉功能
 * @author: lxq
 * @create: 2019-11-18 18:04:12
 */
@RestController
@RequestMapping("/complain")
public class ComplainController {
    @Autowired
    private ComplainService complainService;

    /**
     * 分页查询
     * @param pageNo 页码
     * @param pageSize 页大小
     * @param complain 投诉对象
     * @return 投诉对象分页集合
     */
    @RequestMapping("/page")
    public PageInfo<Complain> page(@RequestParam(defaultValue = "1") Integer pageNo,
                                       @RequestParam(defaultValue = "10") Integer pageSize,
                                       Complain complain){
        return complainService.page(pageNo,pageSize,complain);
    }

    /**
     * 删除多个
     * @param id 投诉id
     * @return 是否成功
     */
    @RequestMapping("/deletes")
    public boolean deletes(String id){
        String[] ids =id.split(",");
        boolean deleteStatic;
        for (String deleteId : ids){
            deleteStatic =complainService.delete(Integer.valueOf(deleteId));
            if(!deleteStatic){
                return false;
            }
        }
        return true;
    }
}