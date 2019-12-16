package com.face.controller;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.face.bo.LoginBO;
import com.face.dao.LoginDAO;
import com.face.util.ConnectionManager;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Boolean status=false;
		response.setContentType("text/html");
		LoginBO obj=new LoginBO();
		String uname=request.getParameter("user");
		String upass=request.getParameter("pass");
		
		obj.setUsername(uname);
		obj.setPassword(upass);
		ConnectionManager con=new ConnectionManager();
		try
		{
			status=LoginDAO.save(con.getConnection(),obj);
			if(status==true)
			{
				
				List <String>agentList  = new ArrayList<String>();
				    agentList.add(obj.getUsername());   
				    agentList.add(obj.getPassword());  
				    agentList.add(obj.getEmail());   
				    agentList.add(obj.getDate());        
				    request.setAttribute("data", agentList);  
				    RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");  
				    if (dispatcher != null)
				    {        dispatcher.forward(request, response);
				    
				    
				    }
				    
				  
			
			}
			else
			{
				response.sendRedirect("/SampleDynamic/Login.jsp");
			}
		}
		catch(Exception  e)
		{
			e.printStackTrace();
		}
	}

}
