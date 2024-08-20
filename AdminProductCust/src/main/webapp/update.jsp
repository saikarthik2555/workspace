<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="using_3techniques.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
AdminBean ab=(AdminBean)session.getAttribute("abean");
out.println("This page Belongs to "+ab.getFname()+"<br>");

String message=(String)request.getAttribute("msg");
out.println(message);
%>
<a href="viewproducts">View Products</a><br>
<a href="product.html">Add Product</a><br>
<a href="logout">Log out</a><br>
</body>
</html>