package com.ict.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 인터페이스는 상수와 추상 메소드만 가지고있다.
public interface Command {
	public String exec(HttpServletRequest request, HttpServletResponse response);

}
