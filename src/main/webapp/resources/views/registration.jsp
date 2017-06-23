<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>

<html>
<head>
    <title>Register</title>
    <link href="<c:url value="/resources/css/registration.css" />" rel="stylesheet">
</head>
<body>
 <h1>Registration form:</h1>
 <sf:form method="POST" commandName="user" action="/register">
     <sf:label path="firstName" cssErrorClass="error">First name</sf:label>:
     <sf:input path="firstName" cssErrorClass="error"/>
     <sf:errors path="firstName" cssClass="error" /><br/>

     <sf:label path="lastName" cssErrorClass="error">Last name</sf:label>:
     <sf:input path="lastName" cssErrorClass="error"/>
     <sf:errors path="lastName" cssClass="error" /><br/>

     <sf:label path="userName" cssErrorClass="error">User name</sf:label>:
     <sf:input path="userName" cssErrorClass="error"/>
     <sf:errors path="userName" cssClass="error" /><br/>

     <sf:label path="email" cssErrorClass="error">Email</sf:label>:
     <sf:input path="email" cssErrorClass="error"/>
     <sf:errors path="email" cssClass="error" /><br/>

     <sf:label path="password" cssErrorClass="error">Password</sf:label>:
     <sf:password path="password" cssErrorClass="error"/>
     <sf:errors path="password" cssClass="error" /><br/>
    <input type="submit" value="Register" />
 </sf:form>
</body>
</html>
