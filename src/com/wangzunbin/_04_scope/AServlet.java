package com.wangzunbin._04_scope;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/scope/a")
public class AServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3800290831488555344L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 设置请求中的共享数据
		Object numInRequest = req.getAttribute("NUM_IN_REQUEST");
		if (numInRequest != null) {
			Integer iNum = Integer.valueOf(numInRequest.toString());
			req.setAttribute("NUM_IN_REQUEST", iNum +1);
		} else {
			req.setAttribute("NUM_IN_REQUEST", 1);
		}
		// 设置会话中的共享数据
		Object numInSession = req.getSession().getAttribute("NUM_IN_SESSION");
		if (numInSession != null) {
			Integer iNum = Integer.valueOf(numInSession.toString());
			req.getSession().setAttribute("NUM_IN_SESSION", iNum +1);
		} else {
			req.getSession().setAttribute("NUM_IN_SESSION", 1);
		}
		// 设置应用中的共享数据
		Object numInApplication = req.getSession().getServletContext().getAttribute("NUM_IN_APPLICATION");
		if (numInApplication != null) {
			Integer iNum = Integer.valueOf(numInApplication.toString());
			req.getSession().getServletContext().setAttribute("NUM_IN_APPLICATION", iNum +1);
		} else {
			req.getSession().getServletContext().setAttribute("NUM_IN_APPLICATION", 1);
		}
		
		req.getRequestDispatcher("/scope/b").forward(req, resp);;
	}
}
