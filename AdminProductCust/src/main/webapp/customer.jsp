<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="using_3techniques.UserBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
UserBean ub=(UserBean)session.getAttribute("ubean");
out.println("Welcome Customer "+ub.getUname());
%>
<!--  
<form action="viewcustomerprofile" method="post">
<input type="hidden" name="uname" value=<%=ub.getUname() %>>
<input type="hidden" name="pswd" value=<%=ub.getPswd() %>>
<input type="submit" value="view profile">
</form>
-->
<a href="viewcustomerprofile">View Customer Profile</a>
<a href="viewproductsforcustomer">View Products</a><br>
<a href=" logoutuser"> User Log out</a>
</body>
</html>