<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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

        <h1>Resource</h1>

        <spring:url value="/resource/save" var="formUrl"/>
        <form:form action="${formUrl}" method="POST" modelAttribute="resource">

            <div class="form-group">
                <label for="resouce-name">Name</label>
                <form:input path="name" cssClass="form-control" id="resouce-name"/>
            </div>

            <div class="form-group">
                <label for="resource-type">Type</label>
                <form:select path="type" items="${typeOptions}" cssClass="selectpicker" id="resource-type"/>
            </div>

            <div class="form-group">
                <label for="unit">Unit of measure</label>
                <input type="text" id="unit" class="form-control" name="unitOfMeasure"/>
            </div>

            <button type="submit" class="btn btn-default">Submit</button>

        </form:form>
    </div>
</div>
</body>
</html>
