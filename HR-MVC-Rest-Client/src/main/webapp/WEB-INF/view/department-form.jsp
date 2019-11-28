<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Department Form</title>
<!-- <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" /> -->
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>

	<div class="jumbotron text-center">
		<div>
			<h1 class="display-4">Human Resources System</h1>		
		</div>
	</div>
	
	<div class="container">
	
	<form action="saveDepartment" method="GET">
		<input type="hidden" name="depId" value="${depId}"/>
		
		<div class="form-group row">
    		<label class="col-md-3 col-form-label" for="validationCustomUsername">Department Name</label>
    		<div class="col-md-3">
      			<input class="form-control" type="text" name="depName" value="${depName}"/>
    		</div>
  		</div>
		
		<div class="form-group row">
    		<label class="col-md-3 col-form-label">Manager Name</label>
    		<div class="col-md-3">
      			<select name="employeeId" class="custom-select">
					<option value="0"/>
					<c:forEach var="temp" items="${employees}" varStatus="status">
						<c:choose>
				            <c:when test="${temp.key eq empId}">
				                <option value="${temp.key}" selected="selected">${temp.value}</option>
				            </c:when>
				            <c:otherwise>
				                <option value="${temp.key}">${temp.value}</option>
				            </c:otherwise>
				        </c:choose>
					</c:forEach>
				</select>
    		</div>
  		</div>
  		
  		<div class="form-group row">
    		<label class="col-md-3 col-form-label">Manager Name</label>
    		<div class="col-md-3">
      			<select name="locationId" class="custom-select">
						<option value="0"/>
						<c:forEach var="temp" items="${locations}">
						<c:choose>
				            <c:when test="${temp.key eq locId}">
				                <option value="${temp.key}" selected="selected">${temp.value}</option>
				            </c:when>
				            <c:otherwise>
				                <option value="${temp.key}">${temp.value}</option>
				            </c:otherwise>
				        </c:choose>
						</c:forEach>	
				</select>
    		</div>
  		</div>
  		
  		<div class="form-group row">
		    <div class="col-md-3">
		      
		    </div>
		    <div class="col-md-3">
		      <button onclick="window.location.href='saveDepartment'" class="btn btn-primary">Save</button>
		    </div>
  		</div>
  		
	</form>	
	</div>
	
	<div class="container">
		<button onclick="window.location.href='${pageContext.request.contextPath}/department/list'"
				class="btn btn-outline-primary">Back to List</button>
	</div>
	

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
	
</body>
</html>