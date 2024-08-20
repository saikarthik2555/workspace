<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="using_3techniques.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
ArrayList<ProductBean> al=(ArrayList<ProductBean>)session.getAttribute("alist");
if(al==null){
	out.println("No Products Available");
}else{
	Iterator i=al.iterator();
	while(i.hasNext()){
				ProductBean pb=(ProductBean)i.next();
			out.println(pb.getCode()+"&nbsp&nbsp"+pb.getName()+"&nbsp&nbsp"+pb.getPrice()+"&nbsp&nbsp"+pb.getQty()+"<a href='buy?pcode="+pb.getCode()+"'>Buy</a>"+"<br>");
	}	
}
%>
<a href="viewcustomerprofile">View Customer Profile</a>
<a href="logoutuser">User Logout </a>
</body>
</html>