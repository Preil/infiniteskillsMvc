
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="content-type" content="text/html" charset="ISO-8859-1">
    <title>Project Manager</title>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
    <link rel="stylesheet" href="<spring:url value="/resources/css/home.css"/>" type="text/css">
    <link rel="stylesheet" href="<spring:url value="/resources/css/bootstrap-select.min.css"/>" type="text/css"/>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
    <script src="<spring:url value="/resources/js/bootstrap-select.min.js"/>"></script>
</head>
<body>
    <jsp:include page="../views/fragments/header.jsp"/>
    <div class="container">
        <div class="row">

            <div class="form-group">
                <label>Name</label>
                <span>${project.name}</span>
            </div>

            <div class="form-group">
                <label>Type</label>
                <span>${project.type }</span>
            </div>

            <div class="form-group">
                <label>Sponsor</label>
                <span>${project.sponsor}</span>
            </div>

            <div class="form-group">
                <label>Authorized Funds</label>
                <span>${project.authorizedFunds}</span>
            </div>

            <div class="form-group">
                <label>Authorized Hours</label>
                <span>${project.authorizedHours}</span>
            </div>

            <div class="form-group">
                <label>Description</label>
                <span>${project.description}</span>
            </div>

            <div class="form-group">
                <label>Special</label>
                <span>${project.special == true ? 'Yes':'No'}</span>
            </div>

            <c:forEach items="${project.pointsOfContact}" var="point" varStatus="loop">
                <div class="form-group">
                    <label>POC ${loop.index+1}</label>
                    <span>${point}</span>
                </div>
            </c:forEach>

        </div>
    </div>
</body>
</html>
