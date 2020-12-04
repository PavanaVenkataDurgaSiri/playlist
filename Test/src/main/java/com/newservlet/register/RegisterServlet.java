package com.newservlet.register;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.newservlet.playlist.PlayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import java.io.IOException;

@WebServlet(urlPatterns = "/register.do")
public class RegisterServlet extends HttpServlet {

	private UserValidationService validation = new UserValidationService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		if (validation.validate.containsKey(name)) {
			request.getRequestDispatcher("/WEB-INF/views/register.jsp").forward(request, response);
		} else {
			validation.validate.put(name, password);
			request.getRequestDispatcher("/WEB-INF/views/Login.jsp").forward(request, response);
			// System.out.println("data inserted");
		}
	}
}
