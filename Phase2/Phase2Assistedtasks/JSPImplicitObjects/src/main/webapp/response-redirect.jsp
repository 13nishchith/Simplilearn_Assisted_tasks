<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get Header Example</title>
</head>
<body>
<%
	String office = request.getParameter("office");
	if(office!=null)
		out.println("value of office obtained:"+office+"<br>");
	else
		out.println("no vlaue of office found"+"<br>");
%>

</body>
</html>