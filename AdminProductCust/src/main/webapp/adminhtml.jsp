<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    import="using_3techniques.AdminBean" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
AdminBean ab=(AdminBean)session.getAttribute("admindetails");
out.println("Welcome Admin : "+ab.getFname());
%>
<a href="product.html">Add Product</a><br>
<a href="viewproducts">View Products</a><br>
<a href="logoutadmin">Admin Log out</a><br>
</body>
</html>