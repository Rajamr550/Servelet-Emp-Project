<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/style.css" />



</head>
<body>
	FirstNAme:<%= session.getAttribute("fname") %><br>
	LastName:<%= session.getAttribute("lname") %><br>
	Age:<%= session.getAttribute("age") %><br>
	Mobile:<%= session.getAttribute("mobile") %><br>
</body>
</html>