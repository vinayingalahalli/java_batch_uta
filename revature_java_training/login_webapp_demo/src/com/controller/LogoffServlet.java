package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LogoffServlet
 */
public class LogoffServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogoffServlet() {
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
			session.invalidate();
			out.print("<center><h2>You will be logged off in 5 seconds</h2></center>");
			response.setHeader("refresh", "5;url=/login_webapp_demo");
		}else {
			out.print("<h4>You need to Login First</h4>");
			out.print("<a href='/login_webapp_demo'>Click here to Login</a>");
		}
	}

}
