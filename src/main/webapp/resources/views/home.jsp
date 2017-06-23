<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Home</title>
</head>
<body>
 <h1>Spittr</h1>
 <a href="<c:url value="/spittles/" />" >Show spittles</a><br>
 <a href="<c:url value="/spittles/show?spittle_id=4" />" >Show 4th spittle</a><br>
 <a href="<c:url value="/register" />" >Register</a>
</body>
</html>
