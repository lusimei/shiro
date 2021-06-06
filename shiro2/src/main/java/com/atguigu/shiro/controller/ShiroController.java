package com.atguigu.shiro.controller;

import com.atguigu.shiro.service.ShiroService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.session.HttpServletSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/shiro")
public class ShiroController {

    @Autowired
    private ShiroService shiroService;

    @RequestMapping("/testShiroAnnotion")
    public String testShiroAnnotation(HttpSession session){
        session.setAttribute("key","-----------------------$$$$$$$$$$$$$----------------");
        shiroService.testMethod();
        return "redirect:/list.jsp";
    }

    @RequestMapping("/login")
    public String login(@RequestParam("username")String username,
                        @RequestParam("password")String password){
        Subject subject = SecurityUtils.getSubject();
        if(!subject.isAuthenticated()){
            UsernamePasswordToken token = new UsernamePasswordToken(username,password);
            //在页面加一个记住我的checkbox 如果有值则设置rememberMe为true,否则不进行设置
            token.setRememberMe(true);
            try{
                System.out.println("loginToken:"+token.hashCode());
                subject.login(token);
            }catch (Exception e){
                System.out.println("登录失败："+e.getMessage());
            }
        }
        return "redirect:/list.jsp";
    }

}
