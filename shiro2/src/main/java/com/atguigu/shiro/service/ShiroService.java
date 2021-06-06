package com.atguigu.shiro.service;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.session.Session;

import java.util.Date;

public class ShiroService {

    @RequiresRoles({"admin"})
    public void testMethod(){
        System.out.println("@@@@ShiroService@@@@:"+new Date());
        Session session = SecurityUtils.getSubject().getSession();
        System.out.println(session.getAttribute("key"));
    }
}
