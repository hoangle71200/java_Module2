<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/static/css/bootstrap.css">
</head>
<body>
    <div class="container">

        <h1>Student List</h1>
        <a id="" class="btn btn-success" href="/student?action=create" role="button">Add</a>
        <form class="d-flex" style="float: right" action="/student?action=search" method="post">
            <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search" name="search" value="${nameSearch}">
            <button class="btn btn-outline-primary" type="submit">Search</button>
        </form>
        <table class="table">
            <thead>
            <tr>
                <th>#</th>
                <th>Name</th>
                <th>DateOfBirth</th>
                <th>Email</th>
                <th>Address</th>
                <th>Phone</th>
                <th>Classroom</th>
                <th>Action</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${studentList}" var="student">
                <tr>
                    <td>${student.getId()}</td>
                    <td>${student.name}</td>
                    <td>${student.birthday}</td>
                    <td>${student.email}</td>
                    <td>${student.address}</td>
                    <td>${student.phone}</td>
                    <td>${student.classroom}</td>
                    <td>
                        <a class="btn btn-warning" href="/student?action=edit&editID=${student.getId()}" role="button">Edit</a>
                        <a class="btn btn-danger" href="/student?action=delete&deleteID=${student.getId()}" role="button">Delete</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>

    </div>
</body>
</html>
