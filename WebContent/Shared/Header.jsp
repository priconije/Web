<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>	
		<title>Product exchange</title>
		
		<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
		<script src="../js/jquery-3.3.1.js"></script>
	    <script src="../js/pooper-1.14.7.min.js"></script>
	    <script src="../js/bootstrap.min.js"></script>
		<link rel="stylesheet" href="../css/bootstrap-lumen.css">
	</head>
	
	<body>
		<h1>
			<i style="padding:0 0 0 20px;">Product exchange</i>
		</h1>
	
		<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
			<a class="navbar-brand" href="${pageContext.request.contextPath}/index.jsp">Homepage</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarColor01" aria-controls="navbarColor01" aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			
			<div class="collapse navbar-collapse" id="navbarColor01">
				<ul class="navbar-nav mr-auto">
					<li class="nav-item dropdown">
						<a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">Ads</a>
						<div class="dropdown-menu">
							<a class="dropdown-item" href="${pageContext.request.contextPath}/Ads/AdNew.jsp">New Ad</a>
							<a class="dropdown-item" href="${pageContext.request.contextPath}/Ads/AdEdit.jsp">Edit Ads</a>
							<div class="dropdown-divider"></div>
							<a class="dropdown-item" href="${pageContext.request.contextPath}/Ads/CategoryNew.jsp">New Ad Category</a>
							<a class="dropdown-item" href="${pageContext.request.contextPath}/Ads/CategoryEdit.jsp">Edit Ad Categories</a>
						</div>
					</li>
					
					<li class="nav-item dropdown">
						<a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">Items</a>
						<div class="dropdown-menu">
							<a class="dropdown-item" href="${pageContext.request.contextPath}/AllItems">All Items</a>
							<a class="dropdown-item" href="${pageContext.request.contextPath}/Ads/ItemNew.jsp">New Item</a>
							<a class="dropdown-item" href="${pageContext.request.contextPath}/Ads/ItemEdit.jsp">Edit Items</a>
						</div>
					</li>
	<!-- 				<li class="nav-item"> -->
	<!-- 					<a class="nav-link" href="#">Link</a> -->
	<!-- 				</li> -->
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