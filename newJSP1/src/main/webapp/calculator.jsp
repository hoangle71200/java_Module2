<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<%--<link rel="stylesheet" href="static/css/bootstrap.css">--%>
<%--<script src="static/js/bootstrap.js"></script>--%>
<link rel="stylesheet" href="static/myCSS/calculator.css">
<body>

        <h1>Simple Calculator</h1>
        <form action="/calculator" method="get">
            <fieldset>
                <legend>Calculator</legend>
                <label for="operand1ID">First Operand: </label>
                <input type="text" id="operand1ID" name="txtOperand1">
                <br>
                <label for="operatorID">Operator: </label>
                <select name="txtOperator" id="operatorID">
                    <option value="1">Cộng</option>
                    <option value="2">Trừ</option>
                    <option value="3">Nhân</option>
                    <option value="4">Chia</option>
                </select>
                <br>
                <label for="operand2ID">Second Operand: </label>
                <input type="text" id="operand2ID" name="txtOperand2">
                <br>
                <input type="submit" value="Calculate">
            </fieldset>
        </form>
        <h1>Result</h1>
        <c:choose>
            <c:when test="${operator == 1}">${num1} + ${num2} = ${num1 + num2}</c:when>
            <c:when test="${operator == 2}">${num1} - ${num2} = ${num1 - num2}</c:when>
            <c:when test="${operator == 3}">${num1} * ${num2} = ${num1 * num2}</c:when>
            <c:when test="${operator == 4}">${num1} / ${num2} = ${num1 / num2}</c:when>
            <c:otherwise>0</c:otherwise>
        </c:choose>
</body>
</html>
