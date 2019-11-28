<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Human Resources System</title>
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
		<f:form action="searchDepartment" method="GET">
			<div class="form-row align-items-center">
				<div class="col-auto">
					<input class="form-control" type="text" name="searchName" placeholder="Department Name"/>
				</div>
				<div class="col-auto">
					<select name="employeeId" class="custom-select">
						<option value="0"/>
						<c:forEach var="temp" items="${employees}">
				        	<option class="dropdown-item" value="${temp.key}">${temp.value}</option>
						</c:forEach>
					</select>
				</div>
				<div class="col-auto">
					<select name="locationId" class="custom-select">
						<option value="0"/>
						<c:forEach var="temp" items="${locations}">
				        	<option value="${temp.key}">${temp.value}</option>
						</c:forEach>	
					</select>
				</div>
				<div class="col-auto">
					<input type="submit" value="Search" class="btn btn-outline-secondary"/>
				</div>
			
			</div>
		</f:form>
			<br>
		
			<div class="form-row">
				<div class="col-auto">
					<button type="button" class="btn btn-outline-primary" onclick="window.location.href='showDepartmentForm'">Add New Department
					</button>
				</div>
				<!-- 
				<f:form action="updateDepartment" method="GET">
				<div class="col-auto">
				<input type="hidden" id="radioParam" name="radioName" value="radioName"/>
					<button type="button" onclick="window.location.href='updateDepartment'" class="btn btn-outline-success">Update</button>	
				</div>
				</f:form>
				<f:form action="deleteDepartment" method="GET">
				<div class="col-auto">
					<input type="hidden" id="radioParam2" name="radioName" value="radioName"/>
					<button type="button" onclick="if (confirm('Department is deleting, are you sure?')) window.location.href='deleteDepartment'" class="btn btn-outline-danger">Delete</button>	
				</div>
				</f:form>
				 -->
			</div>

	</div>
	
	<div class="container">
		<br>
	</div>
	
	<div class="container">
	<table class="table table-striped">
		<thead>
			<tr>
				<th scope="col">Department Name</th>
				<th scope="col">Manager Name</th>
				<th scope="col">Location</th>
				<th></th>
			</tr>
		</thead>
		
		<tbody>
			<c:forEach var="temp" items="${departments}">
				<tr>
					
					<td>${temp.depName}</td>
					<td>${temp.manager}</td>
					<td>${temp.location}</td>
					
					<f:form action="updateDepartment" method="GET">
					<div class="col-auto">
						
					</div>
					<c:url var="deleteLink" value="/department/deleteDepartment">
						<c:param name="departmentId" value="${temp.depId}" />
					</c:url>
					<td>
						<label class="radio-inline">
							<input type="radio" name="radioName" id="radioSelection" value="${temp.depId}"/>				
 						</label>			
					</td>
					<td>
						<button type="submit" onclick="window.location.href='updateDepartment'" class="btn btn-outline-success">Update</button>
					</td>
					
					</f:form>
					<td>
						<button onclick="if (confirm('Department is deleting, are you sure?')) window.location.href='${deleteLink}'" class="btn btn-outline-danger">Delete</button>
					</td>	
					
				</tr>
			</c:forEach>
		</tbody>
	</table>
	</div>
	
	<script>
		function submitForm() {
		    document.getElementById("radioParam").value = document.getElementById("radioSelection").value;
		    document.getElementById("radioParam2").value = document.getElementById("radioSelection").value;
		}

	</script>
	
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</body>
</html>