package com.college.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

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
 * Servlet implementation class SearchCollegeController
 */
@WebServlet("/colleges")
public class SearchCollegeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchCollegeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		Gson gson=new Gson();
		CollegeBO bo=new CollegeBoImpl();
		PrintWriter out=response.getWriter();
		try {
			List<College> collegeList=bo.getCollegeList();
			out.print(gson.toJson(collegeList));
		} catch (BusinessException e) {
			out.print(e.getMessage());
		}
	}

}
