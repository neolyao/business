package org.adobe.business.dao;


import org.adobe.business.pojo.InventoryLog;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface InventoryLogDao {

    @Select("select * from t_inventory_log")
    List<InventoryLog> find(InventoryLog inventoryLog);

}
