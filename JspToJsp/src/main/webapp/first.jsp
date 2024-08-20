<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="Display.UserBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="ub" class="Display.UserBean" scope="session">Set</jsp:useBean>
<jsp:setProperty property="uname" param="uname" name="ub"/>
<jsp:setProperty property="mid" param="mid" name="ub"/>
<jsp:setProperty property="phno" param="phno" name="ub"/>
<%
out.println("Data Loaded Successfully");
%>
<a href="view.jsp">View Details</a>
</body>
</html>