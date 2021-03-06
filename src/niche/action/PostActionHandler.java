package niche.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import niche.service.PhotoService;

public class PostActionHandler implements ActionHandler {
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String file = request.getParameter("file");
		String title = request.getParameter("title");
		String description = request.getParameter("description");
		String num = request.getParameter("tagNum");
		String tag0 = request.getParameter("tag0");
		
		System.out.println(file);
		System.out.println(title);
		System.out.println(description);
		System.out.println(num);
		System.out.println(tag0);
		
		request.setAttribute("isprivate", false);
		request.setAttribute("ispublic", true);
		request.setAttribute("photos", PhotoService.getAllPublicPhotos());
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
}
