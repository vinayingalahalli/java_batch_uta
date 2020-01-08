package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.to.User;

/**
 * Servlet implementation class SummaryServlet
 */
@WebServlet("/summary")
public class SummaryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SummaryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession(false);
		if(session!=null) {
			User user=(User) session.getAttribute("user");
			user.setOrgname(request.getParameter("orgname"));
			user.setYoe(Float.parseFloat(request.getParameter("yoe")));
			user.setCurrent_salary(Double.parseDouble(request.getParameter("current_salary")));
			user.setExpected_salary(Double.parseDouble(request.getParameter("expected_salary")));
			session.setAttribute("user", user);
			out.print("<h3>Hello "+user.getFirstName()+" .... Your Info</h3>");
			out.print("<h4>"+user+"</h4>");
			out.print("<h5>session id "+session.getId()+"</h5>");
			out.print("<h5>session was created at "+new Date(session.getCreationTime())+"</h5>");
			session.invalidate();//destroys the session
			
		}else {
			out.print("<h4>You need to come from FirstPage</h4>");
			out.print("<a href='/session_demo/'>Click here</a>");
		}
	}

}
