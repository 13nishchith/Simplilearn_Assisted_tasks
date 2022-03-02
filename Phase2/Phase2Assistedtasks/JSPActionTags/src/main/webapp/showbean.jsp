<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display bean properties</title>
</head>
<body>
<jsp:useBean id="productBean" class="com.ProductBean" scope="session"></jsp:useBean>
ProductId : <jsp:getProperty property="productId" name="productBean"/><br>
ProductName : <jsp:getProperty property="productName" name="productBean"/><br>
Price : <jsp:getProperty property="price" name="productBean"/><br>


</body>
</html>