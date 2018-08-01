<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>web</title>
</head>
<body>
<a href="fetchemployeedetails.jsp" style="float:right;">Fetch Employee details</a>
<h3>ADD SALARY DETAILS</h3>
	<form action="MyServlet" method="post">
		<div>
			<label>Employee ID:</label><input type="number" name="empid" required/></br></br>
			<label>Financial Year:</label><select name="financialyear">
												<% for(int i=2005;i<=2018;i++){ %>
													<option value="<% out.print(i); %>"><% out.print(i); %></option>
												<% } %>
			
										</select>
			<label>Month:</label><select name="month">
										<option value="Jan">Jan</option>
										<option value="Feb">Feb</option>
										<option value="Mar">Mar</option>
										<option value="Apr">Apr</option>
										<option value="June">June</option>
										<option value="July">July</option>
										<option value="Aug">Aug</option>
										<option value="Sep">Sep</option>
										<option value="Oct">Oct</option>
										<option value="Nov">Nov</option>
										<option value="Dec">Dec</option>
								</select>
								</br></br>
		</div>
		<div>
			<label>Basic pay:</label><input type="number" name="basicpay" required/>
			<label>Performance Pay:</label><input type="number" name="performancepay" required/></br></br>
			<label>Income Tax:</label><input type="number" name="incometax" required/>
			<label>Food Coupon:</label><input type="number" name="foodcoupon" onkeyup="add()" required/>
			</br></br>
		</div>
		<div>
			<label>Total Salary:</label><input type="number" name="totalsalary" readonly/>
			<input type="submit" name="submit" value="SUBMIT"/>
			<input type="reset" name="reset" value="CANCEL"/>
		</div>
	</form>
	<script type="text/javascript">
		function add(){
			var one=parseInt(document.getElementsByName("basicpay")[0].value);
			var two=parseInt(document.getElementsByName("performancepay")[0].value);
			var three=parseInt(document.getElementsByName("incometax")[0].value);
			var four=parseInt(document.getElementsByName("foodcoupon")[0].value);
			document.getElementsByName("totalsalary")[0].value=one+two-three-four;
			
		}
	
	</script>
	
</body>
</html>