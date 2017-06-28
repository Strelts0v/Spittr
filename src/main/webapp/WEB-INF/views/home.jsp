<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="page" tagdir="/WEB-INF/tags" %>

<page:template>
<jsp:body>
 <h1><spring:message code="home.welcome"/></h1>
 <a href="<c:url value="/spittles/" />" ><spring:message code="home.show.spittles"/></a><br>
 <a href="<c:url value="/spittles/show?spittle_id=4" />" ><spring:message code="home.show.spittle"/></a><br>
 <a href="<c:url value="/register" />" ><spring:message code="home.register"/></a><br>
 <a href="<c:url value="/uploadFile" />"><spring:message code="home.upload.files" /></a><br>
 <a href="<c:url value="/runtimeException" />"><spring:message code="home.exception" /></a><br>
</jsp:body>
</page:template>