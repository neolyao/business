package org.adobe.business.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: demo
 * @description: 分页信息
 * @author: niyao
 * @create: 2019-11-08 16:11
 */
@Data
public class Page implements Serializable {
    private Integer currentPage;
    private Integer pageSize;
    private Integer total;
}