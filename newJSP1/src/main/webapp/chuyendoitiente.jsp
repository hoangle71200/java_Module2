<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/chuyen-doi-tien-te" method="get">
        <input type="text" name="txtTiGia" placeholder="Nhập tỉ giá">
        <input type="text" name="txtSoTien" placeholder="Nhập số tiền">
        <input type="submit">
        <br>
        <label>Tỉ giá hiện tại: ${tiGia}</label>
        <label>Số tiền hiện tại: ${soTien}</label>
        <label>Số tiền sau khi chuyển đổi: ${tiGia*soTien}</label>
    </form>
</body>
</html>
