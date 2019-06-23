<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" type="text/css" href="../css/bootstrap-lumen.css">
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<title>Create new categoryS</title>
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
	
	<jsp:include page="../Shared/Footer.jsp" />
</body>
</html>