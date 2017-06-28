<!DOCTYPE html>

<%@tag description="Template Site tag" pageEncoding="UTF-8"%>
<%@taglib prefix="page" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<%@attribute name="title" fragment="true" %>
<%@attribute name="header" fragment="true" %>
<html>
<head>
    <title><jsp:invoke fragment="title"/></title>
    <!-- Bootstrap Core CSS -->
    <spring:url value="/resources/css/bootstrap.css" var="bootstrap"/>
    <link href="${bootstrap}" rel="stylesheet" />

    <!-- Bootstrap Core JavaScript -->
    <spring:url value="/resources/js/bootstrap.min.js" var="js"/>
    <script src="${js}"></script>
</head>

<body>

<page:header-template/>

<jsp:doBody/>

<div class="container">
    <footer>
        <div class="row">
            <div class="col-lg-12">
                <a href="<%=request.getContextPath()%>?locale=en">EN</a>
                <a href="<%=request.getContextPath()%>?locale=ru">RU</a>
                <p>Copyright © com.gv 2017</p>
            </div>
        </div>
    </footer>
</div>

</body>

</html>