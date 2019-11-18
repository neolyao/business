package org.adobe.business.dao;


import org.adobe.business.pojo.InventoryLog;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InventoryLogDao {

    List<InventoryLog> find(@Param("startDateTime") String startDateTime,@Param("endDateTime") String endDateTime,@Param("inventoryLog") InventoryLog inventoryLog);

    @Delete("delete from t_inventory_log where inventory_log_id=#{id}")
    Integer delete(@Param("id") Integer id);
}
