<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" type="text/css" href="../css/bootstrap-lumen.css">
<title>Log In</title>
</head>
<body>
<div style="position: relative;  min-height: 100vh;">
	<jsp:include page="../Shared/Header.jsp" />
	
	<form class="form-control" style="max-width: 40%; margin: auto; margin-top: 2rem" action="${pageContext.request.contextPath}/LogIn" method="post">		
		<fieldset>
			<legend>Log In</legend>
			<div class="form-group">
				<label class="col-form-label" for="inputDefault">Username</label>
				<input type="text" class="form-control" name="username">
			</div>
			
	    	<div class="form-group">
	      		<label for="exampleInputPassword1">Password</label>
	      		<input type="password" class="form-control" name="password">
	    	</div>
	    	
	    	<p class="text-danger" id="errorText">${sessionScope.logInError}</p>
	    	
	    	<button type="submit"  class="btn btn-primary">Log In</button>
    	</fieldset>
   	</form>
	
	<jsp:include page="../Shared/Footer.jsp" />
	</div>
</body>
</html>