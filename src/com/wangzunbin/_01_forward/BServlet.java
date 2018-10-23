package com.wangzunbin._01_forward;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/forward/b")
public class BServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7368281849177638474L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("请求了B请求.......");
		// 在这里主要是验证它是否可以跨越访问
		/*RequestDispatcher dispatcher = req.getRequestDispatcher("http://www.baidu.com");
		dispatcher.forward(req, resp);*/
		// 这里验证它是否可以访问WEB-INF的资源
		RequestDispatcher dispatcher = req.getRequestDispatcher("/login.html");
		dispatcher.forward(req, resp);
	}
}
