<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String str="Hello Everyone";
	String str1="hi";

%>
<h1><%= str %> <%=str1 %>  <%=str1+" "+ str %></h1>	

<centre>
	<%
		for(int i=0;i<=6;i++){
	%>
			<font size="<%=i %>"> Hello World</font></br>
	<%
		}
	
	%>

</centre>

</body>
</html>