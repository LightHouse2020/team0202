/*
 * Copyright (C) 2013～2023
 * Yfann Software Technology (Shanghai) Co.，LTD
 * All Rights Reserved.
*/

package exercise09_shixuan.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ExerciseDispatcherServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String urlStr = request.getRequestURI();

		request.getSession().setAttribute("userName", "name");
		request.getSession().setAttribute("userAge", "age");
		request.getSession().setAttribute("userAgender", "agender");
		request.getSession().setAttribute("userAddress", "address");
		request.getSession().setAttribute("userHobby", "Hobby");

		if ("/exercise09_shixuan/creatUser".equals(urlStr)) {
			// TODO 处理
			request.getRequestDispatcher("/WEB-INF/jsp/creatUser.jsp").forward(request, response);
		}else if ("/exercise09_shixuan/index".equals(urlStr)) {
			// TODO 处理
			request.getRequestDispatcher("/WEB-INF/jsp/XXX.jsp").forward(request, response);
		}

		else if ("".equals(urlStr)) {
			request.getRequestDispatcher("/WEB-INF/jsp/XXX.jsp").forward(request, response);
		}
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String urlStr = request.getRequestURI();
		if ("/exercise09_shixuan/creatUser".equals(urlStr)) {
			// TODO 处理
			request.getRequestDispatcher("/WEB-INF/jsp/creatUser.jsp").forward(request, response);

		} else if ("".equals(urlStr)) {
			request.getRequestDispatcher("/WEB-INF/jsp/XXX.jsp").forward(request, response);
		}

	}

}
