package com.zz.shirodemo.controller;

import com.zz.shirodemo.po.Account;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {

    @GetMapping("/info")
    public String info() {
        return "ok for info api.";
    }

    @GetMapping("/private")
    public String private_info() {
        Subject subject = SecurityUtils.getSubject();
        Account account = (Account) subject.getPrincipal();
        return "ok for private info api.";
    }

}
