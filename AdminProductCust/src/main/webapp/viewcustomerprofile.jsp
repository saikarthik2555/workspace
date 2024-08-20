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
out.println("User Name:"+ub.getUname()+"<br>");
out.println("Password :"+ub.getPswd()+"<br>");
out.println("First Name:"+ub.getFname()+"<br>");
out.println("Last Name:"+ub.getLname()+"<br>");
out.println("Address :"+ub.getAddr()+"<br>");
out.println("Mail Id:"+ub.getMid()+"<br>");
out.println("Phone Number:"+ub.getPhno()+"<br>");
%>
<a href="logoutuser">User Logout</a>
</body>
</html>