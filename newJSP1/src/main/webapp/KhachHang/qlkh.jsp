<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<link rel="stylesheet" href="/static/css/bootstrap.css">
<script src="static/js/bootstrap.js"></script>
<link rel="stylesheet" href="/static/myCSS/khachhangCSS.css">
<body>
    <div id="khachhangID">
        <h1>Danh sách khách hàng</h1>
        <table class="table">
            <thead>
            <tr>
                <th>Id</th>
                <th>Tên</th>
                <th>Tuổi</th>
                <th>Địa chỉ</th>
                <th>Ảnh</th>
            </tr>
            </thead>
            <tbody>

            <c:forEach items="${khachHangList}" var="khachhang">
                <tr>
                    <td scope="row">${khachhang.id}</td>
                    <td>${khachhang.name}</td>
                    <td>${khachhang.ngaysinh}</td>
                    <td>${khachhang.diachi}</td>
                    <td><img src="/static/data/${khachhang.anh}"></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>
