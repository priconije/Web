<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Items</title>
		
		<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
		<!--<script type="text/javascript" src="../js/ItemsPagination.js"></script> -->
		<script src="../js/jquery-3.3.1.js"></script>	
	</head>
	
	<body>		
		<jsp:include page="../Shared/Header.jsp" />
		
		<h2 style="padding:20px">Items</h2>
		
		<div style="width: 50%; height:50%; padding:20px;" id="allItemsTable">
			<table class="table table-hover table-striped">
				<thead>
					<tr>
						<th scope="col">Name</th>
						<th scope="col">Price</th>
						<th scope="col">Quantity</th>
						<th scope="col">Description</th>
						
						<th scope="col"><a href="${pageContext.request.contextPath}/AllItems" class="btn btn-secondary">Reload All</a></th>
					</tr>
				</thead>
								
				<tbody>
					<c:forEach items="${sessionScope.allItemsList}" var="item">
						<tr>
							<td>${item.getName()}</td>
							<td>${item.getPrice()}</td>
							<td>${item.getQuantity()}</td>
							<td>${item.getDescription()}</td>
							<td><button type="button" class="btn btn-secondary" data-dismiss="modal" >Edit Item</button></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>				
		</div>
	</body>
</html>