import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.newservlet.register.UserValidationService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import java.io.IOException;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

	private UserValidationService userValidationService = new UserValidationService();

	private PlayListService playListService = new PlayListService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/Login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String password = request.getParameter("password");

		boolean isUserValid = userValidationService.isUserValid(name, password);

		if (isUserValid) {
			request.getSession().setAttribute("name", name);
			response.sendRedirect("/playlist.do");

			/*
			 * request.setAttribute("name", name); request.setAttribute("password",
			 * password);
			 * request.setAttribute("playlist",playListService.retrivePlayList());
			 * request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request,
			 * response);
			 */
		} else {
			request.setAttribute("errorMessage", "Invalid Username or password");
			request.getRequestDispatcher("/WEB-INF/views/Login.jsp").forward(request, response);
		}

	}

}