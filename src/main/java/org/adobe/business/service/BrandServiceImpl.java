package org.adobe.business.service;

import org.adobe.business.dao.BrandDao;
import org.adobe.business.pojo.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author
 * @date 2019/11/5 10:49
 */
@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandDao brandDao;

    @Override
    public List<Brand> getAllBrand() {
        return brandDao.getAllBrand();
    }

    @Override
    public Integer insertBrand(Brand brand) {
        System.out.println(brand);
        return brandDao.insertBrand(brand);
    }

    @Override
    public Integer deleteBrand(Integer id) {
        return brandDao.deleteBrand(id);
    }

    @Override
    public Integer updateBrand(Brand brand) {
        return brandDao.updateBrand(brand);
    }
}
