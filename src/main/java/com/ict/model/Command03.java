package com.ict.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Command03 implements Command{
	// 성적 구하는 메소드
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		String msg = "";
		// 성적 구하기
		
		String name = request.getParameter("name");
		int kor = Integer.parseInt(request.getParameter("kor"));
		int eng = Integer.parseInt(request.getParameter("eng"));
		int math = Integer.parseInt(request.getParameter("math"));
		int sum = kor + eng + math;
		double avg = (int)(sum/3.0*10)/10.0;
		String hak = "";
		if(avg>=90) {
			hak = "A학점";
		}else if(avg>=80){
			hak = "B학점";
		}else if(avg>=70) {
			hak = "C학점";
		}else {
			hak = "F학점";
		}
		msg = " 이름 : " + name + ", 총점 :  " + sum + "점, 평균 :  " + avg + "점, 학점 : " + hak;
		return msg ;
	}
}
