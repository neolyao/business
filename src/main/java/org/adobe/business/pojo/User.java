package org.adobe.business.pojo;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @program: business
 * @description: 用户
 * @author: niyao
 * @create: 2019-11-06 09:11
 */
@Data
@Alias("User")
public class User implements Serializable {
    private Integer id;
    private String  name;
    private String  password;
    private Date    create_date;
    private String  status;
    private List<Role> roleList;
}