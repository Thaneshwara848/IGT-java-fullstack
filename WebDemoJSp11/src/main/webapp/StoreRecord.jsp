<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<%!
			String uid,name,age,salary,desig;
			Connection con;
			PreparedStatement pstmt;
		%>
		<%
			uid=request.getParameter("uid");
			name=request.getParameter("uname");
			age=request.getParameter("uage");
			salary=request.getParameter("usalary");
			desig=request.getParameter("udesig");	
			try {
				Class.forName("com.mysql.jdbc.Driver"); 
				con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo", "root","root");			
				pstmt=con.prepareStatement("insert into emp values(?,?,?,?,?)");
				pstmt.setString(1, uid);
				pstmt.setString(2, name);
				pstmt.setString(3, age);
				pstmt.setString(4, salary);
				pstmt.setString(5, desig);
				pstmt.execute();
				pstmt.close();
				con.close();	
				out.print("<h1> Data Inserted Successfully");
			}
				catch (Exception e) {
					System.out.println(e);
				}
		%>
		<h2>
		UID :<%=uid %><br>
		UNAME :<%=name %><br>
		UAGE :<%=age %><br>
		USALARY:<%=salary %><br>
		DESIG :<%=desig %><br>
		
		
		
		
		</h2>
		

</body>
</html>