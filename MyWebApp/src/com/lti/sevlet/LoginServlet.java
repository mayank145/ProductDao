package com.lti.sevlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lti.service.DatabaseLoginService;
import com.lti.service.LoginService;


@WebServlet("/login.lti")
public class LoginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			//reading user input
		String uname=request.getParameter("uname");
		String pwd=request.getParameter("pwd");
		
		//LoginService loginservice=new LoginService();
		DatabaseLoginService loginservice=new DatabaseLoginService();
		boolean isValid = loginservice.authenticate(uname,pwd);
		if(isValid)
			response.sendRedirect("Welcome.html");
		else
			response.sendRedirect("login.html");
		
		
	
}
}
