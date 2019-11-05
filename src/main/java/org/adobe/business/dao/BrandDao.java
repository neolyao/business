package org.adobe.business.dao;

import org.adobe.business.pojo.Brand;

import java.util.List;

/**
 * @author
 * @date 2019/11/5 10:51
 */

public interface BrandDao {

    List<Brand> getAllBrand();

    int insertBrand();
}
