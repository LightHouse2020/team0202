package exercise09_shixuan.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServletDemon extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
        String password = request.getParameter("password");

		System.out.println("username=" + username);
		request.setAttribute("username", username);
		request.getRequestDispatcher("/WEB-INF/jsp/creatUser.jsp").forward(request, response);

	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		System.out.println("username=" + username);
		request.setAttribute("username", username);
		request.getRequestDispatcher("/WEB-INF/jsp/creatUser.jsp").forward(request, response);

	}
}
