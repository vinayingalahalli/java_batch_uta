package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bo.impl.UserBoImpl;
import com.exception.BusinessException;
import com.to.User;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		User user=new User();
		RequestDispatcher rd=null;
		try {
		user.setUsername(Integer.parseInt(request.getParameter("username")));
		user.setPassword(request.getParameter("password"));
		
		if(new UserBoImpl().isValidUser(user)) {
			rd=request.getRequestDispatcher("success");
			rd.forward(request, response);
		}
		}catch(NumberFormatException e) {
			rd=request.getRequestDispatcher("login.html");
			rd.include(request, response);
			out.print("<center><span style='color:red;'>Invalid Logon Credentials</span></center>");
			
		} catch (BusinessException e) {
			rd=request.getRequestDispatcher("login.html");
			rd.include(request, response);
			out.print("<center><span style='color:red;'>"+e.getMessage()+"</span></center>");
		}
	}

}
