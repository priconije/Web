<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" type="text/css" href="../css/bootstrap-lumen.css">
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<title>Create new Ad</title>
</head>
<body>
<div style="position: relative;  min-height: 100vh;">
	<jsp:include page="../Shared/Header.jsp" />
	
	<form class="form-control" style="max-width: 40%; margin: auto; margin-top: 2rem" action="" method="post">		
		<fieldset>
			<legend>New Ad</legend>
			<div class="form-group">
				<label class="col-form-label" for="inputDefault">Title</label>
				<input type="text" class="form-control" name="title" required>
			</div>
			
	    	<div class="form-group">
	      		<label for="exampleInputPassword1">Price</label>
	      		<input type="text" class="form-control" name="price">
	    	</div>
	    	
	    	<div class="form-group">
				<label class="col-form-label" for="inputDefault">Description</label>
				<input type="text" class="form-control" name="description">
			</div>
			
			<div class="form-group">
				<label class="col-form-label" for="inputDefault">Image</label>
				<input type="text" class="form-control" name="image">
			</div>
			
			<div class="form-group">
				<label class="col-form-label" for="inputDefault">City</label>
				<input type="text" class="form-control" name="city">
			</div>
						
	    <button type="submit" class="btn btn-primary">Add</button>
 	</fieldset>
</form>
	
	<jsp:include page="../Shared/Footer.jsp" />
	</div>
</body>
</html>