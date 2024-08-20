<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="Display.UserBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
out.println("Hello"+"<br>");
%>
<jsp:useBean id="ub" type="Display.UserBean" scope="session"/>
UserName : <jsp:getProperty property="uname" name="ub"/><br>
MaildId : <jsp:getProperty property="mid" name="ub"/><br>
Phone Number : <jsp:getProperty property="phno" name="ub"/><br>
<jsp:include page="home.html"/>
</body>
</html>