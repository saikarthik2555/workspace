
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="using_3techniques.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ViewAllProducts</title>
</head>
<body>
<%
AdminBean ab=(AdminBean)session.getAttribute("abean");
out.println("This page belongs to "+ab.getUname()+"<br>");
ArrayList<ProductBean> al=(ArrayList<ProductBean>)session.getAttribute("alist");
if(al.size()==0){
	out.println("No Products Available");
}else {
	Iterator<ProductBean> i=al.iterator();
	while(i.hasNext()){
		ProductBean pb=(ProductBean)i.next();
		out.println(pb.getCode()+"&nbsp"+pb.getName()+"&nbsp"+pb.getPrice()+"&nbsp"+pb.getQty()+"&nbsp"+"&nbsp"+"&nbsp"+"<a href='edit?pcode="+pb.getCode()+"'>Edit</a>"+"&nbsp"+"&nbsp"+"<a href='delete?pcode="+pb.getCode()+"'>Delete</a>"+"<br>");
	}																																		
}
%>
<a href="product.html">Add Product</a><br>
<a href="logoutadmin"> Admin Log Out</a>
</body>
</html>