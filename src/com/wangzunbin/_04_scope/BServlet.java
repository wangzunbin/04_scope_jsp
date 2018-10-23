package com.wangzunbin._04_scope;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 作用域: 数据共享
 * 
 * @author Administrator
 *
 */
@WebServlet("/scope/b")
public class BServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7368281849177638474L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			resp.setContentType("text/html;charset=utf-8");
			PrintWriter writer = resp.getWriter();
			// 获取请求中的共享数据
			Object numInRequest = req.getAttribute("NUM_IN_REQUEST");
			writer.print("请求中的共享数据" + numInRequest + "<br/>");
			
			Object numInSession = req.getSession().getAttribute("NUM_IN_SESSION");
			writer.print("会话中的共享数据" + numInSession + "<br/>");
			Object numInApplication = req.getSession().getServletContext().getAttribute("NUM_IN_APPLICATION");
			writer.print("应用中的共享数据" + numInApplication + "<br/>");
	}
}
