package org.adobe.business.pojo;

/**
 * @program: business
 * @description: 项目测试类
 * @author: niyao
 * @create: 2019-11-05 11:34
 */
public class Test {

    private Integer id;
    private String  name;

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

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}