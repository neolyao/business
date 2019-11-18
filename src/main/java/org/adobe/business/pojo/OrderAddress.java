package org.adobe.business.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * 订单地址
 */
@Data
public class OrderAddress implements Serializable {
    private static final long serialVersionUID = 4957827747678694116L;
    private Integer Id;
    private Integer parentId; //orderAddress的id,父id
    private String type; //类型(1:仓库，2:区)
    private String name; //名称

}
