package com.newservlet.playlist;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;

@WebServlet(urlPatterns = "/deleteplaylist.do")
public class DeletePlayListServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	private PlayListService playListService=new PlayListService();

	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		playListService.deletePlayList(new PlayList(request.getParameter("playlist")));
		response.sendRedirect("/playlist.do");
	}
	
	/*protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		String newPlayList = request.getParameter("playlist2");
		playListService.addPlayList(new PlayList(newPlayList));
		response.sendRedirect("/playlist.do");
	}*/

}
