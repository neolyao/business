package org.adobe.business.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @description: 商品库存日志
 * @author: lixuqiang
 * @create: 2019-11-8 11:20:59
 */
@Data
public class InventoryLog implements Serializable {
    private static final long serialVersionUID = -3004081296573235029L;
    private Integer inventoryLogId; //商品库存日志id
    private Integer inventoryLogStoreId; //店铺id
    private Integer inventoryLogNumber; //编号
    private String commodityName; //商品名称
    private Integer commodityId; //商品id
    private String orderNumber; //订单号
    private String operationType; //操作类型
    private String operator; //操作人员
    private String inventory; //库存
    private String inventoryType; //库存类型
    private Date operationTime; //操作时间

}
