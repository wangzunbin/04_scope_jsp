package com.wangzunbin._05_servletcontext;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/context/test")
public class ServletContextServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 76257188939137316L;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		// 1. 获取ServletContext的方法
//		ServletContext servletContext = config.getServletContext();
		String encoding = config.getInitParameter("encoding");
		System.out.println("获取得当前会话的初始化参数" + encoding);
		ServletContext servletContext = config.getServletContext();
		String initParameter = servletContext.getInitParameter("encoding");
		System.out.println("获取得全局的初始化参数" + initParameter);
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 2. 第二种方法
		ServletContext servletContext = req.getSession().getServletContext();
		
		// 获取上下文路径
		String path = servletContext.getContextPath();
		System.out.println(path);
		// 根据给定的资源的的相对路劲, 获取绝对路径
		String realPath = servletContext.getRealPath("/context/test");
		System.out.println(realPath);
	}
}
