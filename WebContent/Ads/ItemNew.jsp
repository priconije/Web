<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" type="text/css" href="../css/bootstrap-lumen.css">
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<title>Add new item</title>
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
	
	<jsp:include page="../Shared/Footer.jsp" />
</body>
</html>