package com.cud.Model;


import java.awt.List;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.crud.dao.UserDao;
import com.crud.bean.User;

/**
 * Servlet implementation class ControllerServlet
 */
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	
	    Connection con =null;
	    
	    UserDao dao = new UserDao();
	    
	    con =UserDao.getConnection();
	    
	    java.util.List<User> list=new ArrayList<User>(); 
	    
	    list = UserDao.getAllRecords();
	    
	    
	    HttpSession session =  request.getSession();
	    
	    
	    session.setAttribute("userdata", list);

			   
	    RequestDispatcher rd =request.getRequestDispatcher("viewusers.jsp");
		
	   rd.forward(request, response);
	   
	   
	   PrintWriter out = response.getWriter();

	for (User userdata: list)
	   {
		
		out.println(userdata.getName());
		out.print("Client has reached in servlet");
		
		
	   }
//	   
		
	   
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
