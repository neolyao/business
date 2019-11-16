package org.adobe.business.dao;


import org.adobe.business.pojo.InventoryLog;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InventoryLogDao {

    List<InventoryLog> find(@Param("startDateTime") String startDateTime,@Param("endDateTime") String endDateTime,@Param("inventoryLog") InventoryLog inventoryLog);

}
