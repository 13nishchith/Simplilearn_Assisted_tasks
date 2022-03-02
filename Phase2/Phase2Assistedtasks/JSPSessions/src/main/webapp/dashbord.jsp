<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	if(session.getAttribute("name")==null) {
		response.sendRedirect("index.jsp?error=1");
	}
%>
<b>hello <%= session.getAttribute("name") %></b><br>
<b>your password is <%= session.getAttribute("pwd") %></b><br>
<a href="logout.jsp">click here to logout</a>

</body>
</html>