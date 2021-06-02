package com.ict.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex04")
public class Ex04 extends HttpServlet {
	private static final long serialVersionUID = 1L; 
    public Ex04() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 응답에 대한 한글 처리
		response.setContentType("text/html; charset=utf-8");
		// 출력 처리
		PrintWriter out = response.getWriter();
		
		// 프로젝트/서블릿문서
		out.println("<a href='/01_servlet/Ex03'>문서3</a>");
		out.println("<a href='"+ request.getContextPath() + "/Ex03'>문서3</a>");
	}

}
