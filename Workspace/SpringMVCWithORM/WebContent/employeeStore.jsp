<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Employee Store</h2>
<form action="storeEmployee" method="post">
	<label>Id</label>
	<input type="text" name="id"><br/>
	<label>Name</label>
	<input type="text" name="name"><br/>
	<label>Salary</label>
	<input type="text" name="salary"><br/>
	<label>Desg</label>
	<input type="text" name="desg"><br/>
	<input type="submit" value="store record">
	<input type="reset" value="reset">
</form>
<%
//out.println(request.getAttribute("msg"));
if(request.getAttribute("msg") != null){
	out.println(request.getAttribute("msg"));
}
%>
</body>
</html>