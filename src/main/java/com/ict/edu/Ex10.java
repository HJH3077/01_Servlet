package com.ict.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex10")
public class Ex10 extends HttpServlet {
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
		
		// 1. 리다이렉트 : 다른 페이지로 이동하면서 기존의 request와 response 정보가 사라진다.
		// 				   새로운 request와 response가 만들어진다.
		//				   즉, 파라미터 값들이 사라진다.
		//				   주소창에 최종 주소가 보인다.
		
		// 사용법 : response.sendRedirect("이동할 주소");
		//			이 때 이동할 주소가 서블릿이면 확장자를 사용하지 않는다.
		//			근데, 이동할 주소가 html이면 확장자를 사용한다.
		
		// 클라이언트한테 한번이라도 가면 파라미터 값이 없어진다.
		// 리다이렉트는 요청을 보내는 브라우저(클라이언트)가 서블릿(웹페이지, 서버)에게 
		// request를 한다. 근데 서블릿에 리다이렉트가 있어서 다른 서블릿이나 html 등에게 
		// 가야하는데 이 때 브라우저에 다시 갔다가 새로운 곳으로 이동하는 방식이다.
		// 이 떄 request, response가 사라지고 새로운 request, reponse가 만들어진다.
		
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		out.println("<h2> Ex10 페이지</h2>");
		out.println("<h3>");
		out.println("<li>이름 : " + name + "</li>" );		
		out.println("<li>나이 : " + age + "</li>" );		
		out.println("</h3>");
		
		response.sendRedirect("Ex11");
	}

}
