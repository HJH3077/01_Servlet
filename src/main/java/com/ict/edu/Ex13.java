package com.ict.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex13")
public class Ex13 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		// 페이지 이동(리다이렉트, 포워드)
		// => 현재 페이지에서 작업한 후 다른 페이지로 이동 (현재 페이지는 보이지 않는다.)
		
		// 1. 포워드 : 다른 페이지로 이동하면서 기존의 request와 response 정보를 그대로 가져간다.
		//			   즉, 파라미터 값들이 사라지지 않는다.
		//			   주소창에 최초 주소가 보인다.
		
		// 사용법 : request.getRequestDispatcher("이동할 주소").forword(request, response);
		//			이 때 이동할 주소가 서블릿이면 확장자를 사용하지 않는다.
		//			근데, 이동할 주소가 html이면 확장자를 사용한다.
		
		// 클라이언트한테 한번이라도 가면 파라미터 값이 없어진다.
		// 포워드는 한번이라도 간적이 없기 때문에 리다이렉와 달리 값이 그대로 유지가되며 request이다.
		
		
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		out.println("<h2> Ex13 페이지</h2>");
		out.println("<h3>");
		out.println("<li>이름 : " + name + "</li>" );		
		out.println("<li>나이 : " + age + "</li>" );		
		out.println("</h3>");
		
	}

}
