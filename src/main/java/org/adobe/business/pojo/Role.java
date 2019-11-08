package org.adobe.business.pojo;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.io.Serializable;
import java.util.List;

/**
 * @program: business
 * @description: 角色
 * @author: niyao
 * @create: 2019-11-06 10:37
 */
@Data
@Alias("Role")
public class Role implements Serializable {
    private Integer id;
    private String  name;
    private String  memo;
    private List<Permission> permissionList;
}