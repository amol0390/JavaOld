package com.LoginValidation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControllerServlet extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException 
	{
		
		res.setContentType("text/html");  
		
		String name =req.getParameter("name");
		
//		String password =getInitParameter("pwd");
		

		if( name.equals("Amol"))
		{
			RequestDispatcher rd = req.getRequestDispatcher("wel");
			
			rd.forward(req, res);

			
		}
		
		else
		{
			
		System.out.println("Hello");
		
		PrintWriter prnt = res.getWriter();
		
        prnt.print("Hello " + name + " You login is failed");
        
    	RequestDispatcher rd = req.getRequestDispatcher("/index.jsp");
		
		rd.include(req, res);

		}
		
		
		
		
	}
	
}
