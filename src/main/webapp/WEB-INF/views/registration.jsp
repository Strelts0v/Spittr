<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="page" tagdir="/WEB-INF/tags" %>

<head>
    <title>Register</title>
    <link href="<c:url value="/resources/css/registration.css" />" rel="stylesheet">
</head>

<page:body-template>
<jsp:body>
 <h1><spring:message code="registration.form.header" /></h1>
 <sf:form method="POST" commandName="user" action="/register">

     <sf:label path="firstName" cssErrorClass="error"><spring:message code="registration.firstName" /></sf:label>:
     <sf:input path="firstName" cssErrorClass="error"/><br>
     <%--<sf:errors path="firstName" cssClass="error"/><br/>--%>

     <sf:label path="lastName" cssErrorClass="error"><spring:message code="registration.lastName" /></sf:label>:
     <sf:input path="lastName" cssErrorClass="error"/><br>
     <%--<sf:errors path="lastName" cssClass="error" /><br/>--%>

     <sf:label path="userName" cssErrorClass="error"><spring:message code="registration.userName" /></sf:label>:
     <sf:input path="userName" cssErrorClass="error"/><br>
     <%--<sf:errors path="userName" cssClass="error" /><br/>--%>

     <sf:label path="email" cssErrorClass="error"><spring:message code="registration.email" /></sf:label>:
     <sf:input path="email" cssErrorClass="error"/><br>
     <%--<sf:errors path="email" cssClass="error" /><br/>--%>

     <sf:label path="password" cssErrorClass="error"><spring:message code="registration.password" /></sf:label>:
     <sf:password path="password" cssErrorClass="error"/><br>
     <%--<sf:errors path="password" cssClass="error" /><br/>--%>
    <input type="submit" value="<spring:message code="home.register" />" />
 </sf:form>
</jsp:body>
</page:body-template>
