package org.adobe.business.pojo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Data
public class OrderStatus {
    private Integer orderStatusId;
    private Integer storeId;
    private Integer orderSequence;
    private String handlers;
    private Date handlersTime;
    private String orderStatus;
    private Date orderHandlersTime;
    private String paymentStatus;
    private Date paymentHandlersTime;
    private String shipmentsStatus;
    private Date shipmentsHandlersTime;
    private String salesReturnStatus;
    private Date salesReturnTime;
    private String orderStatusRemark;


}
