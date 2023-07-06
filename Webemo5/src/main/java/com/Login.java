package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname=request.getParameter("uname");
		String upass= request.getParameter("upass");
		
		PrintWriter out= response.getWriter();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo", "root","root");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("Select * from emp");
			response.setContentType("text/html");

			out.print("<h3>");
			while(rs.next())
			{
				if(uname.equalsIgnoreCase(rs.getString(1))&& upass.equalsIgnoreCase(rs.getString(2)))
				{
					RequestDispatcher rd=request.getRequestDispatcher("MainEmp.html");
					rd.forward(request, response);
				}
				else {
					out.print("<p style='color:red'>Invalid Credentials .....!<p>");
					RequestDispatcher rd=request.getRequestDispatcher("LoginPage.html");
					rd.include(request, response);
				}
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	
}
