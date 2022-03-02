<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Usage of useBean tag<br>
<jsp:useBean id="productBean" class="com.ProductBean" scope="session"></jsp:useBean>
<jsp:setProperty property="productId" name="productBean" value="189546"/>
<jsp:setProperty property="productName" name="productBean" value="Dell laptop"/>
<jsp:setProperty property="price" name="productBean" value="70500"/>

<a href="showbean.jsp">bean properties form another page<br></a>
<a href="forward.jsp">use this action to browse</a><br>

<jsp:text>
This page contains action tags
</jsp:text>

</body>
</html>