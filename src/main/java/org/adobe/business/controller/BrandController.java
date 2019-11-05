package org.adobe.business.controller;

import org.adobe.business.pojo.Brand;
import org.adobe.business.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author
 * @date 2019/11/5 11:01
 */
@RestController
public class BrandController {

    @Autowired
    private BrandService brandService;

    @RequestMapping("/getAllBrand")
    public List<Brand> getAllBrand(){
        return brandService.getAllBrand();
    }

//    @RequestMapping("/")

}
