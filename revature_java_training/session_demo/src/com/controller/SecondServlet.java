package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.to.User;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/second")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession(false);
		if(session!=null) {
			User user=(User) session.getAttribute("user");
			user.setCollege(request.getParameter("college"));
			user.setGpa(Float.parseFloat(request.getParameter("gpa")));
			user.setDegree(request.getParameter("degree"));
			session.setAttribute("user", user);
			response.sendRedirect("three.html");
		}else {
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			out.print("<h4>You need to come from FirstPage</h4>");
			out.print("<a href='/session_demo/'>Click here</a>");
		}
		
		
	}

}
