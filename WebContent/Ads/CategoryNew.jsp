<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Create new category</title>

		<script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
	    <script src="${pageContext.request.contextPath}/js/pooper-1.14.7.min.js"></script>
	    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap-lumen.css">
		<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	</head>
	<body>
		<jsp:include page="../Shared/Header.jsp" />
		<form class="form-control" style="max-width: 40%; margin: auto; margin-top: 2rem" action="${pageContext.request.contextPath}/CategoryNew" method="post">		
			<fieldset>
				<legend> New category</legend>
					<div class="form-group">
						<label class="col-form-label" for="inputDefault">Category name</label>
						<input type="text" class="form-control" name="categoryName" required>
					</div>
					
			    	<div class="form-group">
			      		<label for="exampleInputPassword1">Description</label>
			      		<input type="password" class="form-control" name="description">
			    	</div>
			    	
			    <button type="submit"  class="btn btn-primary">Add</button>
		 	</fieldset>
		</form>		
	</body>
</html>