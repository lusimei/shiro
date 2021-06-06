<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2021/5/28
  Time: 22:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--<h4>List Page</h4>--%>
    <h4>Welcome: <shiro:principal></shiro:principal><h4>
    <shiro:hasRole name="admin">
        <a href="admin.jsp">admin</a>
    </shiro:hasRole>
    <br><br>
    <shiro:hasRole name="user">
        <a href="user.jsp">user</a>
    </shiro:hasRole>
    <br><br>
    <a href="shiro/testShiroAnnotion">testShiroAnnotion</a>
    <br><br>
    <a href="shiro/logout">Logout</a>
</body>
</html>
