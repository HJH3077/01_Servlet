package com.ict.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex07")
public class Ex07 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		try {
			out.println("<h2>여기는 서블릿 Ex07 계산기 입니다.</h2>");
			String num1 = request.getParameter("num1");
			String num2 = request.getParameter("num2");
			String op = request.getParameter("operation");
			int n1 = Integer.parseInt(num1);
			int n2 = Integer.parseInt(num2);
			int result = 0;
			switch (op) {
			case "+": result = n1 + n2; break;
			case "-": result = n1 - n2; break;
			case "*": result = n1 * n2; break;
			case "/": result = n1 / n2; break;
			}
			
			out.println("<h3>");
			out.println("계산 결과 : " + n1 + op + n2 + " = " + result + " 입니다.");
			out.println("</h3>");
			
		} catch (Exception e) {
			out.println("</h2><결과> : 0으로는 나눌 수 없습니다.</h2>");
		}
	}

}
