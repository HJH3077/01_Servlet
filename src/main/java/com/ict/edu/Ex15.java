package com.ict.edu;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex15")
public class Ex15 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		// 하나의 서블릿에 너무 많은 양을 처리하는 단점이 생긴다.
		// 이것을 해결하기 위해서 별도의 일처리하는 자바클래스를 만들어서 호출한다.		
		String cmd = request.getParameter("cmd");
		switch (cmd) {
		case "1":	
			out.println("<h2>오늘 날짜</h2>");
			Calendar now = Calendar.getInstance();
			int year = now.get(Calendar.YEAR);
			int month = now.get(Calendar.MONTH) + 1;
			int day = now.get(Calendar.DATE);
			out.println("<h3>오늘의 날짜는 " + year + "." + month + "." + day + " 입니다.</h3>");
			break;
		case "2":	
			out.println("<h2>오늘의 운세</h2>");
			int lucky = (int)(Math.random()*101);
			out.println("<h3>오늘의 운세는 " + lucky + "% 입니다.</h3>");
			break;
		case "3":	
			out.println("<h2>오늘의 운세와 날짜 구하기</h2>");
			Calendar now2 = Calendar.getInstance();
			int year2 = now2.get(Calendar.YEAR);
			int month2 = now2.get(Calendar.MONTH) + 1;
			int day2 = now2.get(Calendar.DATE);
			int lucky2 = (int)(Math.random()*101);
			out.println("<h3>오늘의 날짜는 " + year2 + "." + month2 + "." + day2 + " 이고 운세는 " + lucky2 + "% 입니다.</h3>");	
			break;
		}
		
	}

}
