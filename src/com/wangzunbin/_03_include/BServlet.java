package com.wangzunbin._03_include;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/include/b")
public class BServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7368281849177638474L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("请求了B请求.......");
		// 这里主要验证是否可以重定向
		
	}
}
