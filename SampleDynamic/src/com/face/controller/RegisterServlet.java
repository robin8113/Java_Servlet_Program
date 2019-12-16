package com.face.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.face.bo.RegisterBO;
import com.face.dao.RegisterDAO;
import com.face.util.ConnectionManager;

/**@author robin Jacob
 * Servlet implementation class RegisterServlet
 * @Date 14-11-209
 */

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		String name=request.getParameter("usern");
		String pass=request.getParameter("passn");
		String email=request.getParameter("emln");
		String dob=request.getParameter("dobn");
		
		RegisterBO obj=new RegisterBO();
		
		obj.setUname(name);
		obj.setPass(pass);
		obj.setEmail(email);
		obj.setDob(dob);
		ConnectionManager con=new ConnectionManager();
		try {
			RegisterDAO.save(con.getConnection(),obj);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect(request.getContextPath()+"/Login.jsp");
	}

}
