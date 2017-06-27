<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="page" tagdir="/resources/tags" %>

<page:template>
    <jsp:attribute name="title">Spittr</jsp:attribute>
    <jsp:body>
        <h1><spring:message code="spittr.welcome" /></h1>
        <a href="<c:url value="/spittles/" />" >Show spittles</a><br>
        <a href="<c:url value="/spittles/show?spittle_id=4" />" >Show 4th spittle</a><br>
        <a href="<c:url value="/register" />" >Register</a>
    </jsp:body>
</page:template>