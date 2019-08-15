<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Add new item</title>
	</head>
	
	<body>
		<jsp:include page="../Shared/Header.jsp" />
		<form style="max-width: 40%; margin: auto; margin-top: 2rem" action="${pageContext.request.contextPath}/ItemAdd" method="post">		
			<fieldset>
				<legend>New Item</legend>
				
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
				
<!-- 				<div class="form-group"> -->
<!-- 					<label class="col-form-label" for="inputDefault">Description</label> -->
<!-- 					<input type="text" class="form-control" name="itemDescription"> -->
<!-- 				</div> -->
				
				<div class="form-group">
					<label for="exampleTextarea">Description</label>
					<textarea name="itemDescription" class="form-control" id="exampleTextarea" rows="3" style="margin-top: 0px; margin-bottom: 0px; height: 106px;"></textarea>
				</div>
							
				<button type="submit"  class="btn btn-primary">Add</button>
			</fieldset>
		</form>		
	</body>
</html>