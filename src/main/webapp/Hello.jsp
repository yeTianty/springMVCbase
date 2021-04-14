<%--
  Created by IntelliJ IDEA.
  User: Tanoty
  Date: 2021/3/24
  Time: 14:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>这是HELLO</h1>
<%--<a href="/helloController/gethello">跳转</a>--%>
<%--<a href="/helloController/gethe?username=ty123&password=123456">aa</a>--%>

<form action="/helloController/gethe" method="post">
    用户名：<input type="text" name="username"><br>
    密&emsp;码：<input type="password" name="password"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
