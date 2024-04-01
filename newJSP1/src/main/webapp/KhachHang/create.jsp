<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <title>Title</title>
    <!-- Required meta tags -->
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="/static/css/bootstrap.css">
</head>
<body>
<div class="container">

    <div class="row justify-content-center mt-4">
        <form class="col-md-6" action="/khachHangList?action=create" method="post">
            <h1 class="">Tạo Khách Hàng Mới</h1>
            <div class="form-group">
                <label for="txtId"> ID</label>
                <input type="text" class="form-control" name="customerID" id="txtId">
            </div>
            <div class="form-group">
                <label for="txtName">Tên </label>
                <input type="text" class="form-control" name="customerName" id="txtName">
            </div>
            <div class="form-group">
                <label for="txtName">Ngày sinh </label>
                <input type="text" class="form-control" name="customerBirthday" id="txtBirthday">
            </div>
            <div class="form-group">
                <label for="txtAddress">Địa chỉ</label>
                <input type="text" class="form-control" name="customerAddress" id="txtAddress">
            </div>
            <div class="form-group">
                <label for="txtImage">Ảnh</label>
                <input type="text" class="form-control" name="customerImage" id="txtImage">
            </div>
            <div class="form-group mt-2">
                <button class="btn btn-success" role="button" type="submit">Create</button>
                <button class="btn btn-warning" role="button">Cancel</button>
            </div>
        </form>

    </div>
</div>

</body>
</html>