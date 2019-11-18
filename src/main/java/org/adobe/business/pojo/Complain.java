package org.adobe.business.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * 投诉类
 */
@Data
public class Complain implements Serializable {
    private static final long serialVersionUID = -8717609651322953970L;
    private Integer complainId;
    private Integer storeId;    //商店id
    private String orderSequence; //订单编号
    private Integer complainSequence; //投诉编号
    private Integer userId; //投诉人
    private String complaintType; //投诉类型
    private String complaintContent; //投诉内容
    private String complaintImage; //投诉图片
    private String complaintStatus; //投诉状态
    private String complaintTime; //投诉时间
}
