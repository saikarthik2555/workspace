<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="using_3techniques.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Page</title>
</head>
<body>
<%
AdminBean ab=(AdminBean)session.getAttribute("abean");
out.println("This page belongs to "+ab.getFname()+"<br>");
ProductBean pb=(ProductBean)request.getAttribute("pbean");
%>
<form action="update" method="post">
<input type="hidden" name="pcode" value=<%=pb.getCode() %>><br>  
					<!-- with out value we cannot perform edit -->
					
Price:<input type="text" name="price" value=<%=pb.getPrice() %>><br>
Quantity: <input type="text" name="qty" value=<%=pb.getQty() %>><br>
<input type="submit" value="Update">
</form>
</body>
</html>