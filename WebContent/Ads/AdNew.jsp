<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Create new Ad</title>		
	</head>
	
	<body>		
		<jsp:include page="../Shared/Header.jsp" />
			
			<form style="max-width: 40%; margin: auto; margin-top: 2rem" action="" method="post">
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
	</body>
</html>