package org.adobe.business.pojo;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.io.Serializable;

/**
 * @program: business
 * @description: 权限
 * @author: niyao
 * @create: 2019-11-06 10:40
 */
@Data
@Alias("Permission")
public class Permission implements Serializable {
    private Integer id;
    private String  url;
    private String  name;
}