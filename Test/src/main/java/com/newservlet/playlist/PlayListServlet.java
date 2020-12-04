package com.newservlet.playlist;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;

@WebServlet(urlPatterns = "/playlist.do")
public class PlayListServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	private PlayListService playListService=new PlayListService();

	//private HttpServletResponse respone;

	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		request.setAttribute("playlist",playListService.retrivePlayList());
		request.getRequestDispatcher("/WEB-INF/views/playlist.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		String newPlayList = request.getParameter("playlist2");
		playListService.addPlayList(new PlayList(newPlayList));
		response.sendRedirect("/playlist.do");
		/*request.setAttribute("playlist",playListService.retrivePlayList());
		request.getRequestDispatcher("/WEB-INF/views/playlist.jsp").forward(request, response);*/
		/*String newPlayList=request.getParameter("playlist2");
		playListService.addPlayList(new PlayList(newPlayList));
		respone.sendRedirect("/playlist.do");*/
	
	}
}
