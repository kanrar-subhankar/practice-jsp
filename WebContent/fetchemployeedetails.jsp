<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Fetch Employee Details</title>
</head>
<body>
	
	<form action="employeeServlet" method="post">
		<label>Employee Name:</label><input name="empname" type="text">
		<label>Designation:</label><select name="designation">
								<option value="ase">ase</option>
								<option value="ita">ita</option>
								<option value="ast">ast</option>
								<option value="consultant">consultant</option>
								</select>
		<input type="submit" name="search" value="SEARCH" />
	</form>
	</br></br>
	<% if(request.getParameter("empname")!=null){ %>
	<table border="1px solid black;">
		<tr>
			<th>view</th>
			<th>Employee ID</th>
			<th>Name</th>
			<th>Designation</th>
			<th>Contact Num</th>
			<th>Financial year</th>
			<th>Month</th>
		</tr>
		<tr>
		
			<td><a href="salary.jsp">view</a></td>
			<td><% if(request.getAttribute("empid")!=null)
						out.print(request.getAttribute("empid"));
					%>
			</td>
			<td><% if(request.getParameter("empname")!=null)
				out.print(request.getAttribute("empname")); 
				%>
			</td>
			<td><% if(request.getAttribute("des")!=null)
				out.print(request.getAttribute("des")); 
				%>
			</td>
			<td><% if(request.getAttribute("contact")!=null)
				out.print(request.getAttribute("contact")); 
				%>
			</td>
		</tr>
	</table>
	<%} %>
</body>
</html>