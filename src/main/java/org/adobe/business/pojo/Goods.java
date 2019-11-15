package org.adobe.business.pojo;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.io.Serializable;

/**
 * 商品类
 */
@Data
@Alias("Goods")
public class Goods implements Serializable {
    private Integer goodsId;
    private String  goodsName;
    private String  goodsDesc;
    private Integer goodsCount;
    private Float   goodsPrice;
    private String  goodsImg;
    private String  goodsRepo;
}
