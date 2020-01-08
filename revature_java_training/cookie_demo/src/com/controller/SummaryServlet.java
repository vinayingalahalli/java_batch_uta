package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		Cookie cookies[]=request.getCookies();
		out.print("<table border='1px'>");
		for(Cookie cookie:cookies) {
			out.print("<tr>");
			out.print("<th>"+cookie.getName()+"</th>");
			out.print("<td>"+cookie.getValue()+"</td>");
			out.print("</tr>");
		}
		out.print("<tr>");
		out.print("<th>Organization Name</th>");
		out.print("<td>"+request.getParameter("orgname")+"</td>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<th>Total Years Of Experience</th>");
		out.print("<td>"+request.getParameter("yoe")+"</td>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<th>Current Salary</th>");
		out.print("<td>"+request.getParameter("current_salary")+"</td>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<th>Expected Salary</th>");
		out.print("<td>"+request.getParameter("expected_salary")+"</td>");
		out.print("</tr>");
		out.print("</table>");
	}

}
