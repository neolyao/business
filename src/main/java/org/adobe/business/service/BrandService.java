package org.adobe.business.service;

import org.adobe.business.pojo.Brand;

import java.util.List;

/**
 * @author
 * @date 2019/11/5 10:48
 */
public interface BrandService {

    List<Brand> getAllBrand();

    Integer insertBrand(Brand brand);

    Integer deleteBrand(Integer id);

    Integer updateBrand(Brand brand);

}
