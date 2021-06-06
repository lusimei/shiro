package com.atguigu.shiro.factory;

import java.util.LinkedHashMap;

public class FilterChainDefinitionMapBuilder {

    public LinkedHashMap<String, String> buildFilterChainDefinitionMap(){
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("/login.jsp","anon");
        linkedHashMap.put("/shiro/login","anon");
        linkedHashMap.put("/shiro/logout","anon");
        linkedHashMap.put("/list.jsp","user");
        linkedHashMap.put("/user.jsp","authc,roles[user]");
        linkedHashMap.put("/admin.jsp","authc,roles[admin]");
        linkedHashMap.put("/**","authc");
        return linkedHashMap;
    }

}
