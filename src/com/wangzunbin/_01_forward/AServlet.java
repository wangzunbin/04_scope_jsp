package com.wangzunbin._01_forward;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * 这个是请求转发
 * @author Administrator
 * 特点如下:
 * 1. 地址栏中的地址不会改变
 * 2. 只有一个请求
 * 3. 在两个Servlet中可以共享请求中的数据
 * 4. 最终的响应由BServlet来决定, 和AServlet没有关系
 * 5. 可以访问WEB-INF中的资源
 * 6. 请求转发不能跨域访问
 */
@WebServlet("/forward/a")
public class AServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3800290831488555344L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("请求了A请求.......");
		RequestDispatcher dispatcher = req.getRequestDispatcher("/forward/b");
		dispatcher.forward(req, resp);
	}
}
