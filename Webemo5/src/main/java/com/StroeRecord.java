package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.Principal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StroeRecord
 */
public class StroeRecord extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uid=  request.getParameter("uid");
		String uname=request.getParameter("uname");
		String uage =request.getParameter("uage");
		String usalary= request.getParameter("usalary");
		String udesig= request.getParameter("udesig");
		
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo", "root","root");			
			PreparedStatement pstmt=con.prepareStatement("insert into emp values(?,?,?,?,?)");
			pstmt.setString(1, uid);
			pstmt.setString(2, uname);
			pstmt.setString(3, uage);
			pstmt.setString(4, usalary);
			pstmt.setString(5, udesig);
			

			pstmt.execute();
			pstmt.close();
			con.close();
			
			PrintWriter out=response.getWriter();
			out.print("<h1> Data Inserted Successfully");
			
			out.print("<br><a href='MainEmp.html'>Home PAGE </a>");
			System.out.println("Data Inserted successfully....!");
			}
			catch (Exception e) {
				System.out.println(e);
			}
		
		
	}

	

}
