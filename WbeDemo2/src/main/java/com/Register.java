package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		int uid=Integer.parseInt(request.getParameter("uid"));
		String uname=request.getParameter("uname");
		int uage=Integer.parseInt(request.getParameter("uage"));
		int usalary=Integer.parseInt(request.getParameter("usalary"));
		String udesig=request.getParameter("udesig");
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo", "root","root");
			PreparedStatement pstmt=con.prepareStatement("insert into emp values(?,?,?,?,?)");
			pstmt.setInt(1, uid);
			pstmt.setString(2, uname);
			pstmt.setInt(3, uage);
			pstmt.setInt(4, usalary);
			pstmt.setString(5, udesig);

			pstmt.execute();
			pstmt.close();
			con.close();
			
			System.out.println("Data Inserted successfully....!");
			}
			catch (Exception e) {
				System.out.println(e);
			}
		out.print("<h1>");
		out.print("Hi Mr "+uname +" Your are succssfully Registred....!<br>");
		out.print(uid+"<br>");out.print(uname+"<br>");out.print(uage+"<br>");
		out.print(usalary+"<br>");out.print(udesig+"<br>");out.print("</h1>");
	}
}
