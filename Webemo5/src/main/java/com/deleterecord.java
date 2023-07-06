package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class deleterecord
 */
public class deleterecord extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uid=  request.getParameter("uid");
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo", "root","root");

			
			PreparedStatement pstmt=con.prepareStatement("delete from emp where eid= ?");
			
			
			pstmt.setString(1, uid);
			

			pstmt.execute();
			pstmt.close();
			con.close();
			
			PrintWriter out=response.getWriter();
			out.print("<h1> Data DELETED Successfully");
			System.out.println("Data DLETED successfully....!");
			out.print("<br><a href='MainEmp.html'>Home PAGE </a>");
			}
			catch (Exception e) {
				System.out.println(e);
			}
		
	}

	

}
