<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!doctype html>
<html lang="en">
<head>
    <title>Title</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="/static/css/bootstrap.css">
    <style>
        label {
            font-weight: bolder;
        }
        span {
            font-weight: bolder;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="row justify-content- mt-4">
        <div class="col-md-6">
            <div class="card h-100">
                <div class="card-body">
                    <div class="form-group">
                        <label style="font-weight: bolder">Student ID: ${editStudent.getId()}</label>
                    </div>
                    <h5 class="card-title"> <span>Name: </span> ${editStudent.getName()}</h5>
                    <p class="card-text"><span>Birthday: </span>: ${editStudent.birthday}</p>
                    <p class="card-text"><span>Email: </span>: ${editStudent.email}</p>
                    <p class="card-text"><span>Address: </span>: ${editStudent.address}</p>
                    <p class="card-text"><span>Phone: </span>: ${editStudent.phone}</p>
                    <p class="card-text"><span>Classroom: </span>: ${editStudent.classroom}</p>
                </div>
            </div>
        </div>
        <form class="col-md-6" action="/student?action=edit&editID=${editID}" method="post">
            <h1 class="">Edit Student info</h1>
            <div class="form-group">
                <label for="txtName">Name</label>
                <input type="text" class="form-control" name="editName" id="txtName" placeholder="Enter name">
            </div>
            <div class="form-group">
                <label for="txtEmail">Email address</label>
                <input type="text" class="form-control" name="editEmail" id="txtEmail" placeholder="Enter email">
            </div>
            <div class="form-group">
                <label for="txtBirthday">Date of Birth</label>
                <input type="text" class="form-control" name="editBirthday" id="txtBirthday" placeholder="Enter date of birth as DD/MM/YYYY">
            </div>
            <div class="form-group">
                <label for="txtAddress">Address</label>
                <input type="text" class="form-control" name="editAddress" id="txtAddress" placeholder="Enter address">
            </div>
            <div class="form-group">
                <label for="txtPhone">Phone Number</label>
                <input type="text" class="form-control" name="editPhone" id="txtPhone" placeholder="Enter phone number">
            </div>
            <div class="form-group">
                <label>Class</label>
                <select name="editClass">
                    <option value="C01">C01</option>
                    <option value="C02">C02</option>
                    <option value="C03">C03</option>
                </select>
            </div>
            <div class="form-group mt-2">
                <button class="btn btn-success" role="button" type="submit">Submit</button>
            </div>
        </form>

    </div>
</div>

</body>
</html>