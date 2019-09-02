<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Items</title>
		
		<script type="text/javascript" src="../js/ItemsPagination.js"></script>		
	</head>
	
	<body>		
		<jsp:include page="../Shared/Header.jsp" />
		
		<h2 style="padding:20px">Items</h2>
		<script type="text/javascript">
			test();
		</script>
		<div style="width: 50%; height:50%; padding:20px;">
			<table class="table table-hover">
				<thead>
					<tr>
					  <th scope="col">Type</th>
					  <th scope="col">Column heading</th>
					  <th scope="col">Column heading</th>
					  <th scope="col">Column heading</th>
					</tr>
				</thead>
				
				
				<tbody>
					<tr>
					  <th scope="row">Default</th>
					  <td>Column content</td>
					  <td>Column content</td>
					  <td>Column content</td>
					</tr>
				</tbody>
			</table>				
		</div>
	</body>
</html>