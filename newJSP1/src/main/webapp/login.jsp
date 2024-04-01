<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 3/19/2024
  Time: 11:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div id="loginID">
        <form action="/login-servlet" method="get">
            <input name="txtUsername" type="text" placeholder="Nhập username">
            <input name="txtPassword" type="text" placeholder="Nhập password">
            <input type="submit" value="Xác nhận">
        </form>
    </div>
</body>
</html>
