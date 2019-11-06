package org.adobe.business.controller;

import org.apache.shiro.authz.AuthorizationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: business
 * @description: 捕获全局异常
 * @author: niyao
 * @create: 2019-11-06 13:28
 */
@RestController
@ControllerAdvice
public class ExceptionController {
    @ExceptionHandler(value = AuthorizationException.class)
    public String handleAuthorizationException() {
        return "权限不够";
    }
}
