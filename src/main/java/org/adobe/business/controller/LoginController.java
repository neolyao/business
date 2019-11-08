package org.adobe.business.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;


/**
 * @program: business
 * @description: 登录
 * @author: niyao
 * @create: 2019-11-06 13:00
 */
@RestController
public class LoginController {
    /**
     * 登录验证
     * @param username 用户名
     * @param password 密码
     * @return
     */
    @RequestMapping("/login")
    public String login(String username,String password){

        Subject subject= SecurityUtils.getSubject(); //获得主体
        UsernamePasswordToken token=new UsernamePasswordToken(username,password);
        try{
            subject.login(token);
            return "success";
        }catch (UnknownAccountException e){
            return e.getMessage();
        }catch (IncorrectCredentialsException e){
            return e.getMessage();
        }catch (LockedAccountException e){
            return e.getMessage();
        }

    }
    /**
     * logout
     * @return
     */
    @RequestMapping("/logout")
    public String logout(){
        SecurityUtils.getSubject().logout();
        return "logout success";
    }
}