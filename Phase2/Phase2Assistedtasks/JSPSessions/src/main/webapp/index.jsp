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
	if(request.getParameter("error")!=null)
		out.println("<b> session expired or invalid<br><br>");
%>
<form action="login.jsp" method="post">
Username <input name="name" id="name" maxlength=20><br>
Password <input type="password" name="pwd" id="pwd" maxlength=20><br>
<button>submit</button>

</form>

</body>
</html>