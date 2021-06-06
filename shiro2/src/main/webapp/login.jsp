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
    <h4>Login Page</h4>

    <form action="shiro/login" method="post">
        <input type="text" name="username">
        <br><br>
        <input type="password" name="password">
        <br><br>
        <input type="submit" value="提交">
    </form>
</body>
</html>
