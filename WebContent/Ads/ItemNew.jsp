<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Add new item</title>
		
		<script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
	    <script src="${pageContext.request.contextPath}/js/pooper-1.14.7.min.js"></script>
	    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap-lumen.css">
		<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	</head>
	
	<body>
		<jsp:include page="../Shared/Header.jsp" />
		<form class="form-control" style="max-width: 40%; margin: auto; margin-top: 2rem" action="${pageContext.request.contextPath}/ItemAdd" method="post">		
			<fieldset>
				<legend>Please fill the fields below to add new item</legend>
				
				<div class="form-group">
					<label class="col-form-label" for="inputDefault">Item name</label>
					<input type="text" class="form-control" name="itemName" required>
				</div>
				
				  	<div class="form-group">
					<label class="col-form-label" for="inputDefault">Price</label>
					<input type="text" class="form-control" name="itemPrice">
				</div>
				
				<div class="form-group">
					<label class="col-form-label" for="inputDefault">Quantity</label>
					<input type="text" class="form-control" name="itemQuantity">
				</div>
				
				<div class="form-group">
					<label class="col-form-label" for="inputDefault">Description</label>
					<input type="text" class="form-control" name="itemDescription">
				</div>
							
				  <button type="submit"  class="btn btn-primary">Add</button>
			</fieldset>
		</form>		
	</body>
</html>