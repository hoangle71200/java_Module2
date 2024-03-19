<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>c:remove example</title>
</head>
<body>
<h2>c:remove example</h2>
<c:set scope="page" var="greeting" value="Hello every body" />
Greeting: <c:out value="${greeting}"/>
<br/><br/>
<c:remove scope="request" var="greeting" />
After remove:
<br/>
Greeting: <c:out value="${greeting}"/>
--------------------------------
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
--------------------------------
<h2>c:catch example</h2>
<c:catch var ="ex">
    <%
        int a = 100/0;
    %>
</c:catch>
<c:if test = "${ex == null}">
    Exception : ${ex}
    <br />
    Message: ${ex.message}
</c:if>
</body>
</html>