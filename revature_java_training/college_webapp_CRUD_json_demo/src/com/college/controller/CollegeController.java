package com.college.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.college.bo.CollegeBO;
import com.college.bo.impl.CollegeBoImpl;
import com.college.exception.BusinessException;
import com.college.to.College;
import com.google.gson.Gson;

/**
 * Servlet implementation class CollegeController
 */
@WebServlet({ "/addCollege", "/updateCollege", "/deletCollege", "/college" })
public class CollegeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CollegeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		int id=Integer.parseInt(request.getParameter("id"));
		Gson gson=new Gson();
		CollegeBO bo=new CollegeBoImpl();
		PrintWriter out=response.getWriter();
		try {
			College college=bo.getCollegeById(id);
			out.print(gson.toJson(college));
		} catch (BusinessException e) {
			out.print(e.getMessage());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		Gson gson=new Gson();
		College college=gson.fromJson(request.getReader(), College.class);
		CollegeBO bo=new CollegeBoImpl();
		PrintWriter out=response.getWriter();
		try {
			college=bo.addCollege(college);
			out.print(gson.toJson(college));
		} catch (BusinessException e) {
			out.print(e.getMessage());
		}
		
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
