package mang.demo.maven.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class UserServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException{
//		User user=new User();
//		user.setUserName("test");
//		req.setAttribute("user", user);
		req.setAttribute("user", "test");
		req.getRequestDispatcher("user.jsp").forward(req, resp);
	}
}
