<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <title>Title</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="/static/css/bootstrap.css">
</head>
<body>
<div class="container">

    <div class="row justify-content-center mt-4">
        <form class="col-md-6" action="/student?action=create" method="post">
            <h1 class="">Add new Student</h1>
            <div class="form-group">
                <label for="txtName">Name</label>
                <input type="text" class="form-control" name="studentName" id="txtName" placeholder="Enter name">
            </div>
            <div class="form-group">
                <label for="txtEmail">Email address</label>
                <input type="text" class="form-control" name="studentEmail" id="txtEmail" placeholder="Enter email">
            </div>
            <div class="form-group">
                <label for="txtBirthday">Date of Birth</label>
                <input type="text" class="form-control" name="studentBirthday" id="txtBirthday" placeholder="Enter date of birth as DD/MM/YYYY">
            </div>
            <div class="form-group">
                <label for="txtAddress">Address</label>
                <input type="text" class="form-control" name="studentAddress" id="txtAddress" placeholder="Enter address">
            </div>
            <div class="form-group">
                <label for="txtPhone">Phone Number</label>
                <input type="text" class="form-control" name="studentPhone" id="txtPhone" placeholder="Enter phone number">
            </div>
            <div class="form-group">
                <label>Class</label>
                <select name="studentClass">
                    <option value="C01">C01</option>
                    <option value="C02">C02</option>
                    <option value="C03">C03</option>
                </select>
            </div>
            <div class="form-group mt-2">
                <button class="btn btn-success" role="button" type="submit">Create</button>
            </div>
        </form>

    </div>
</div>

</body>
</html>