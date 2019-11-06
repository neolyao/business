package org.adobe.business.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * @program: business
 * @description: 角色
 * @author: niyao
 * @create: 2019-11-06 10:37
 */
public class Role implements Serializable {

    private Integer id;
    private String  name;
    private String  memo;
    private List<Permission> permissionList;

    public List<Permission> getPermissionList() {
        return permissionList;
    }

    public void setPermissionList(List<Permission> permissionList) {
        this.permissionList = permissionList;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}