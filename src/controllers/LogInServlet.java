package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
import utilities.LogInService;

/**
 * Servlet implementation class LogInServlet
 */
@WebServlet("/LogIn")
public class LogInServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogInServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getSession().removeAttribute("loggedInUser");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		User user = LogInService.ValidateUserOnLogIn(username, password);
		
		if(user != null)
		{
			request.getSession().setAttribute("loggedInUser", user);
			RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
			dispatcher.forward(request, response);
			return;
		}
		else
		{
			request.getSession().setAttribute("logInError", "Username or Password incorrect. Please try again...");
			RequestDispatcher dispatcher = request.getRequestDispatcher("User/LogIn.jsp");			
			dispatcher.forward(request, response);
			return;
		}
	}

}