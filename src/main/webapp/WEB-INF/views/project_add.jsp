
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
                <spring:url value="/project/add" var="formUrl"/>
                <form:form modelAttribute="project" action="${formUrl }" method="post" cssClass="col-md-8 col-md-offset-2">

                <div class="form-group">
                    <label for="project-name">Name</label>
                    <input type="text" id="project-name" class="form-control" name="name"/>
                </div>

                <div class="form-group">
                    <label for="type">Type</label>
                    <form:select path="type" items="${types}" cssClass="selectpicker" id = "type"/>
                </div>

                <div class="form-group">
                    <label for="sponsor">Sponsor</label>
                    <input type="text" id="sponsor" class="form-control" name="sponsor"/>
                </div>

                <div class="form-group">
                    <label for="year">Year</label>
                    <input type="text" id="year" class="form-control" name="year"/>
                </div>

                <div class="form-group">
                    <label for="authorizedFunds">Authorized Funds</label>
                    <input type="text" id="authorizedFunds" class="form-control" name="authorizedFunds"/>
                </div>

                <div class="form-group">
                    <label for="authorizedHours">Authorized Hours</label>
                    <input type="text" id="authorizedHours" class="form-control" name="authorizedHours"/>
                </div>

                <div class="form-group">
                    <label for="description">Description</label>
                    <textarea class="form-control" id="description" name="description" rows="3"></textarea>
                </div>

                <div class="form-group">
                    <label for="special">Special</label>
                    <input id="special" name="special" type="checkbox"/>
                </div>

                <button type="submit" class="btn btn-default">Submit</button>

            </form:form>
        </div>
    </div>
</body>
</html>
