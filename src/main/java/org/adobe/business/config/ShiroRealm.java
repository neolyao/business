package org.adobe.business.config;

import org.adobe.business.pojo.Permission;
import org.adobe.business.pojo.Role;
import org.adobe.business.pojo.User;
import org.adobe.business.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @program: business
 * @description: shiro数据配置
 * @author: niyao
 * @create: 2019-11-06 13:02
 */
public class ShiroRealm extends AuthorizingRealm {
    @Autowired
    private UserService userService;
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        User user=(User) SecurityUtils.getSubject().getPrincipal();
        String  userName=user.getName();
        System.out.println(userName+"进入授权");
        SimpleAuthorizationInfo authorizationInfo=new SimpleAuthorizationInfo();
        List<Role> roleList=userService.findByUserName(userName).getRoleList();
        Set<String> roleSet = new HashSet<String>();
        Set<String> permissionSet=new HashSet<String>();
        for(Role role:roleList){
            roleSet.add(role.getName());
            System.out.println(role.getName());
            List<Permission> permissions=userService.findRolesById(role.getId()).getPermissionList();
            for (Permission permission:permissions){
                System.out.println(permission.getName());
                permissionSet.add(permission.getName());
            }
        }
        authorizationInfo.setRoles(roleSet);
        authorizationInfo.setStringPermissions(permissionSet);
        return authorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String username=(String)token.getPrincipal();
        String password=new String((char[])token.getCredentials());
        System.out.println(username+"进入认证");
        User user=userService.findByUserName(username);
        if(user==null){
            throw new UnknownAccountException("用户名不存在");
        }
        if(!password.equals(user.getPassword())){
            throw new IncorrectCredentialsException("用户名或密码不对");
        }
        if(user.getStatus().equals("0")){
            throw new LockedAccountException("账号已被锁定,请联系管理员！");
        }
        SimpleAuthenticationInfo authenticationInfo=new SimpleAuthenticationInfo(user,password,getName());
        return authenticationInfo;
    }
}