<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String uid=  request.getParameter("uid");
	String usalary= request.getParameter("usalary");
	try {
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo", "root","root");

		
		PreparedStatement pstmt=con.prepareStatement("update emp set salary= ? where eid= ?");
		
		pstmt.setString(1, usalary);
		pstmt.setString(2, uid);
		
		pstmt.execute();
		pstmt.close();
		con.close();
		out.print("<h1> Data Updated Successfully");
		System.out.println("Data Updated successfully....!");
		}
		catch (Exception e) {
			System.out.println(e);
		}
	%>
</body>
</html>