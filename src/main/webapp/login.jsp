<%--
  Created by IntelliJ IDEA.
  User: 25120
  Date: 2021/3/29
  Time: 14:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="css/Loginjsp.css"/>
</head>
<body>
<div id="login">
    <h1>超市订单管理系统</h1>
    <form method="post">
        <input type="text" required="required" placeholder="用户名" name="u"></input>
        <input type="password" required="required" placeholder="密码" name="p"></input>
        <button class="but" type="submit">登录</button>
    </form>
</div>
</body>
</html>
