package org.adobe.business.dao;

import org.adobe.business.pojo.Category;

import java.util.List;

/**
 * @author
 * @date 2019/11/4 19:06
 */
public interface CategoryDao {

    public List<Category> selectAll();

}
