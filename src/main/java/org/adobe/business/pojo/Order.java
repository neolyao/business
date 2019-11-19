package org.adobe.business.pojo;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @program: business
 * @description: 订单表
 * @author: wangxuesong
 * @create: 2019-11-06 13:00
 */
@Data
public class Order implements Serializable {
    private Integer orderId;
    private Integer storeId;
    private Integer orderSequence;
    private String serialNumber;
    private String orderNumber;
    private Integer commodityId;
    private Integer logisticsId;
    private Logistics logistics;
    private String paymentWay;
    private Integer userId;
    private User user;
    private OrderStatus orderStatus;
    private Goods goods;
    private Integer commodityNumber;
    private String source;
    private Integer consigneeId;
    private String headingCode;
    private String buyerMessage;
    private String sellerMessage;
    private String invoiceType;
    private String invoiceTitle;
    private String invoiceContent;
    private String stockoutDispose;
    private String delayAddresseeBoolean;
    private Date delayAddresseeTime;
    private String delayAddresseeOperator;
    private String auditType;

}
