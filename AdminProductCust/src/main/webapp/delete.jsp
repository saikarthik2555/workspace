<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="using_3techniques.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Delete Page</title>
</head>
<body>
<%
String message=(String)request.getAttribute("msg");
out.println(message);
ArrayList<ProductBean> al=(ArrayList<ProductBean>)request.getAttribute("check");
Iterator<ProductBean> i=al.iterator();
while(i.hasNext()){
	ProductBean pb=i.next();
	out.println(pb.getName()+"\t\t"+pb.getCode()+"\t\t"+pb.getPrice()+"\t\t"+pb.getQty()+"<br>");
}
%>
<a href="product">Add Product</a><br>
<a href="viewproducts">View Products</a><br>
<a href="editproduct">Edit Product</a><br>
<a href="logout">Log out</a><br>
</body>
</html>