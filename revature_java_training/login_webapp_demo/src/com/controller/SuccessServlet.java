package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SuccessServlet
 */
public class SuccessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SuccessServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession(false);
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		if(session!=null) {
		out.print("<h2>Welcome "+session.getAttribute("username")+"</h2>");
		out.print("<h3>You have logged in successfully at "+new Date()+"</h3>");
		out.print("<a href='logoff'>LOGOUT</a>");
		}else {
			out.print("<h4>You need to Login First</h4>");
			out.print("<a href='/login_webapp_demo'>Click here to Login</a>");
		}
	}

}
