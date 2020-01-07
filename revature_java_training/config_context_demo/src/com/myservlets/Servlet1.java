package com.myservlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<h2>Accessing config params of Servlet1 in Servlet1");
		ServletConfig config=getServletConfig();
		out.print("<h2>Query 1 : "+config.getInitParameter("query1")+"</h2>");
		out.print("<h2>Query 2 : "+config.getInitParameter("query2")+"</h2>");
		out.print("<h2>Query 3 : "+config.getInitParameter("query3")+"</h2>");
		
		out.print("<br/><br/><h2>Accessing context params in Servlet1</h2>");
		ServletContext context=getServletContext();
		out.print("<h2>URL : "+context.getInitParameter("url")+"</h2>");
		out.print("<h2>Username : "+context.getInitParameter("username")+"</h2>");
		out.print("<h2>Driver : "+context.getInitParameter("driver")+"</h2>");
	}

}
