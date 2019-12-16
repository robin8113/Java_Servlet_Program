<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<%@page language="java" import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/SampleDynamic/LoginServlet">
Welcome
 <%=request.getParameter("user") %><br>
<table border="1" width="400">
<tr>
<td width="119"><b>Name</b></td>
<td width="168"><b>Password</b></td>
<td width="168"><b>Email</b></td>
<td width="168"><b>Date of Birth</b></td>
</tr>
<%Iterator itr;%>
<% List data= (List)request.getAttribute("data");
for (itr=data.iterator(); itr.hasNext(); )
{
%>
<tr>
<td width="119"><%=itr.next()%></td>
<td width="168"><%=itr.next()%></td>
<td width="119"><%=itr.next()%></td>
<td width="168"><%=itr.next()%></td>
</tr>
<%}%>
</table>
</form>

</body>
</html>