<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Create new account</title>
	
	<script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
    <script src="${pageContext.request.contextPath}/js/pooper-1.14.7.min.js"></script>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap-lumen.css">
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
</head>
<body>
<div style="position: relative;  min-height: 100vh;">
	<jsp:include page="../Shared/Header.jsp" />
	
	<form class="form-control" style="max-width: 40%; margin: auto; margin-top: 2rem" action="${pageContext.request.contextPath}/SignUp" method="post">		
		<fieldset>
			<legend>Please fill the fields below to sign up</legend>
			<div class="form-group">
				<label class="col-form-label" for="inputDefault">Username</label>
				<input type="text" class="form-control" name="username" required>
			</div>
			
	    	<div class="form-group">
	      		<label for="exampleInputPassword1">Password</label>
	      		<input type="password" class="form-control" name="password">
	    	</div>
	    	
	    	<div class="form-group">
				<label class="col-form-label" for="inputDefault">First name</label>
				<input type="text" class="form-control" name="firstName">
			</div>
			
			<div class="form-group">
				<label class="col-form-label" for="inputDefault">Last name</label>
				<input type="text" class="form-control" name="lastName">
			</div>
			
			<div class="form-group">
				<label class="col-form-label" for="inputDefault">Telephone number</label>
				<input type="text" class="form-control" name="phone">
			</div>
			
			<div class="form-group">
				<label class="col-form-label" for="inputDefault">Email address</label>
				<input type="text" class="form-control" name="email">
			</div>
			
			<div class="form-group">
				<label class="col-form-label" for="inputDefault">City</label>
				<input type="text" class="form-control" name="city">
			</div>
			
			<div class="form-group">
			  <label for="exampleSelect1">User Role</label>
			  <select class="form-control" name="userRole">
				<c:forEach var="role" items="${userRoleEnum}" >
	    			<option value="${role}">${role}</option>
				</c:forEach>
			  </select>
			</div>
			<div class="form-group">			
				<label class="col-form-label">${userCreatedMessage}</label>
			</div>
	    <button type="submit"  class="btn btn-primary">Sign Up</button>
 	</fieldset>
</form>
	
	
	</div>
</body>
</html>