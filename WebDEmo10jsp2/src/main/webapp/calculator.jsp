<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%!
		int a;
		int b;
		int c ;
	%>
	<%
		a=Integer.parseInt(request.getParameter("n1"));
		b=Integer.parseInt(request.getParameter("n2"));	
		c= a+b;
		
	%>
	Sum of A+B : 
	<%=c%><br>
	 <%=c%><br>
	  <%=c%><br>
	   <%=c%><br>
	    <%=c%><br>

</body>
</html>

