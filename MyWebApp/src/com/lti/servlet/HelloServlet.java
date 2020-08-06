	package com.lti.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/hello.lti") //URL//URI ---Servlet Mapping
public class HelloServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");// MIME 
		PrintWriter out=response.getWriter();
		
		out.write("<html><body>");
		out.write("<h1>Welcomme to the world of servlets</h1>");
		out.write("<h2>Ajj ki taarik :" + LocalDate.now()+"<h2");
		out.write("\u0905");
		out.write("</body></html>");
		
	}

	

}
