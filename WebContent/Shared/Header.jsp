<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" type="text/css" href="../css/bootstrap-lumen.css">
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<title>IdiMiDodjiMiKupiMi</title>
</head>
<body>
	<h1>
		<i>IdiMiDodjiMiKupiMi</i>
	</h1>
	
	<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
  		<a class="navbar-brand" href="${pageContext.request.contextPath}/index.jsp">Home</a>
  		<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarColor01" aria-controls="navbarColor01" aria-expanded="false" aria-label="Toggle navigation">
    		<span class="navbar-toggler-icon"></span>
  		</button>

		<div class="collapse navbar-collapse" id="navbarColor01">
		    <ul class="navbar-nav mr-auto">
				<li class="nav-item dropdown show">
					<a class="nav-link dropdown-toggle" 
					data-toggle="dropdown" 
					href="#" 
					role="button" 
					aria-haspopup="true"
					aria-expanded="true">Ads</a>
					<div class="dropdown-menu show" >
						<a class="dropdown-item" href="#">Action</a>
						<a class="dropdown-item" href="#">Another action</a>
						<a class="dropdown-item" href="#">Something else here</a>
						<div class="dropdown-divider"></div>
						<a class="dropdown-item" href="#">Separated link</a>
					</div>
				</li>
		    	
				<li class="nav-item">
				  <a class="nav-link" href="#">Pricing</a>
				</li>
				<li class="nav-item">
				  <a class="nav-link" href="#">About</a>
				</li>
		    </ul>
			<form class="form-inline my-2 my-lg-0">
				<input class="form-control mr-sm-2" type="text" placeholder="Search">
				<button class="btn btn-secondary my-2 my-sm-0" type="submit">Search</button>
			</form>
			<ul class="navbar-nav" style="margin-left: 2rem">
			 	<c:if test="${empty sessionScope.loggedInUser}">
					<li class="nav-item">
				 		<a class="nav-link" href="${pageContext.request.contextPath}/User/SignUp.jsp">Sign Up</a>
			      	</li>
			 	</c:if>
			 	<c:choose>
			 		<c:when test="${empty sessionScope.loggedInUser}">
				      <li class="nav-item">
				        <a class="nav-link" href="${pageContext.request.contextPath}/User/LogIn.jsp">Log In</a>
				      </li>
			 		</c:when>
			 		<c:otherwise>
			 			<a class="nav-link" href="${pageContext.request.contextPath}/Logout">Logout</a>
			 		</c:otherwise>			 		
			 	</c:choose>
			</ul>
		</div>
	</nav>
</body>
</html>