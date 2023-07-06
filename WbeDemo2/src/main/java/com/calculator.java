package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class calculator
 */
public class calculator extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int n1=Integer.parseInt( request.getParameter("n1"));
		int n2=Integer.parseInt( request.getParameter("n2") ) ;
		
		int sum = n1 + n2 ;
		
		PrintWriter out=response.getWriter();
		out.print("The Sum of A+ B is :"+sum);
		
	}

	

}
