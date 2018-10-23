package com.wangzunbin._03_include;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * 这个是请求包含
 * @author Administrator
 * 特点如下:
	1.  地址栏中的地址会改变
	2 .有2个请求
	3 .在2个Servlet中不可以共享请求中数据
	4.最终的响应由BServlet来决定, 和AServlet没有关系
	5.不可以访问WEB-INF中的资源
	6. 请求转发能跨域访问
	
 */
@WebServlet("/include/a")
public class AServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3800290831488555344L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("请求了A请求.......");
		RequestDispatcher dispatcher = req.getRequestDispatcher("/include/b");
		dispatcher.include(req, resp);
		System.out.println("回到A的Servlet.......");
	}
}
