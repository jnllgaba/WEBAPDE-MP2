package niche.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import niche.bean.User;
import niche.collection.UserCollection;

/**
 * Servlet implementation class Controller
 */
@WebServlet(urlPatterns= {"/login", "/register"})
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String urlpattern = request.getServletPath();
		System.out.println(urlpattern);
		switch(urlpattern) {
			case "/login": checkUser(request, response);
							break;
			case "/register": addUser(request, response);
							break;
		}
		
	}

	private void addUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("regusername");
		String password = request.getParameter("regpassword");
		String description = request.getParameter("description");
		
		User u = new User();
		u.setUsername(username);
		u.setPassword(password);
		u.setDescription(description);
		
		if(UserCollection.addUser(u)) 
			System.out.println("WIE REGISTERED KANA");
			
		response.sendRedirect("index.html");
		
	}

	private void checkUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		List<User> users = UserCollection.getAllUsers();
		boolean registered = false;
		for(User u: users) {
			if(username.equals(u.getUsername()) && password.equals(u.getPassword())) {
				request.setAttribute("un", u.getUsername());
				
				HttpSession session = request.getSession();
				session.setAttribute("sessionuser", u.getUsername());
				
				String rm = request.getParameter("remember");
				if(rm != null) {
					Cookie usernameCookie = new Cookie("username", u.getUsername());
					usernameCookie.setMaxAge(60*60*24*21);
					response.addCookie(usernameCookie);
				}
				
				RequestDispatcher rd = request.getRequestDispatcher("profile.jsp");
				rd.forward(request, response);
				registered = true;
			} 
		}
		
		if(!registered)
			response.sendRedirect("index.html");
	}

}
