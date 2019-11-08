package org.adobe.business;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@SpringBootTest
@RestController
class BusinessApplicationTests {

    @RequestMapping("/hello")
    public String hello(HttpServletResponse response){
        return "hello";
    }

    @RequiresPermissions("user:add")
    @RequestMapping("/add")
    public String add(){
        return "add success";
    }

    @RequiresPermissions("user:delete")
    @RequestMapping("/delete")
    public String delete(){
        return "delete success";
    }
    @Test
    void contextLoads() {
    }

}
