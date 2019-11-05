package org.adobe.business.controller;

import org.adobe.business.pojo.Brand;
import org.adobe.business.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/insertBrand",method = RequestMethod.POST)
    public Integer insertBrand(@RequestBody Brand brand){
        return brandService.insertBrand(brand);
    }

    @RequestMapping("/deleteBrand")
    public Integer deleteBrand(@RequestParam Integer id){
        return brandService.deleteBrand(id);
    }

    @RequestMapping(value = "/updateBrand",method = RequestMethod.POST)
    public Integer updateBrand(@RequestBody Brand brand){
        return brandService.updateBrand(brand);
    }

}
