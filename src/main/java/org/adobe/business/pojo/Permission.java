package org.adobe.business.pojo;

import java.io.Serializable;

/**
 * @program: business
 * @description: 权限
 * @author: niyao
 * @create: 2019-11-06 10:40
 */
public class Permission implements Serializable {
    private Integer id;
    private String  url;
    private String  name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}