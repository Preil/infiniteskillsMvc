<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Project Manager</title>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
    <link rel="stylesheet" href="<spring:url value="/resources/css/bootstrap-select.min.css"/>" type="text/css"/>
    <link rel="stylesheet" href="<spring:url value="/resources/css/global.css"/>" type="text/css"/>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
    <script src="<spring:url value="/resources/js/bootstrap-select.min.js"/>"></script>

</head>
<body>

<jsp:include page="../views/fragments/header.jsp"></jsp:include>

<div class="container">

    <div class="row">
        <h1>Resource</h1>
    </div>



    <div class="row">

        <div class="form-group">
            <label>Name</label>
            <span>${resource.name}</span>
        </div>

        <div class="form-group">
            <label>Type</label>
            <span>${resource.type}</span>
        </div>

        <div class="form-group">
            <label>Cost</label>
            <span>${resource.cost}</span>
        </div>

        <div class="form-group">
            <label>Unit of Measure</label>
            <span>${resource.unitOfMeasure}</span>
        </div>

        <div class="form-group">
            <label>Indicators</label>
            <span>${resource.indicators}</span>
        </div>

        <div class="form-group">
            <label>Notes</label>
            <span>${resource.notes}</span>
        </div>

        <a href="<spring:url value="/resource/add"/>" class="btn btn-default">Edit</a>
        <a href="<spring:url value="/resource/save"/>" class="btn btn-default">Save</a>

    </div>
</div>
</body>
</html>



