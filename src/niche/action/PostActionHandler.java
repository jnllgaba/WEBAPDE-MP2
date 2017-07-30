package niche.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import niche.bean.Photo;
import niche.bean.PhotoTag;
import niche.bean.User;

public class PostActionHandler implements ActionHandler {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user = (User) request.getAttribute("sessionuser");
		String path = request.getParameter("file");
		String title = request.getParameter("title");
		String visible = request.getParameter("visible");
		String description = request.getParameter("description");
		
		Photo photo = new Photo();
		photo.setDescription(description);
		photo.setPath(path);
		photo.setTitle(title);
		photo.setVisible(visible.equals("visible"));
		photo.setUser(user);
		
		List <PhotoTag> tags = new ArrayList <PhotoTag> ();
		int size = Integer.parseInt(request.getParameter("tagNum"));
		
		for(int i = 0; i < size; i++) {
			tags.add(new PhotoTag());
			tags.get(i).setTag(request.getParameter("tag" + size));
		}
	}
}
