package controllers;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import enums.UserRole;
import model.Administrator;
import model.User;

/**
 * Servlet implementation class SignUpServlet
 */
@WebServlet("/SignUp")
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUpServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getSession().setAttribute("userRoleEnum", UserRole.values());
		RequestDispatcher dispatcher = request.getRequestDispatcher("User/SignUp.jsp");
		System.out.println(request.getSession().getAttribute("isUserAdded"));
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		User newUser;
		UserRole newUserRole;
		Date currentDate = new Date();
		String userCreatedMessage;
		
		String selectedRole = request.getParameter("userRole");
		switch(selectedRole)
		{
		
		case "ADMINISTRATOR":
			newUserRole = UserRole.ADMINISTRATOR;
			newUser = new Administrator();
			break;
		
		default:
			System.out.println("SignUp failed, some user data not valid!");
			userCreatedMessage = "Wrong User Role.";
			return;
		}
		
		newUser.setUsername(request.getParameter("username"));
		newUser.setPassword(request.getParameter("password"));
		newUser.setFirstName(request.getParameter("firstName"));
		newUser.setLastName(request.getParameter("lastName"));
		newUser.setPhoneNumber(request.getParameter("phone"));
		newUser.setEmail(request.getParameter("email"));
		newUser.setCity(request.getParameter("city"));
		newUser.setUserRole(newUserRole);
		newUser.setRegistrationDate(DateFormat.getDateTimeInstance().format(currentDate));
		
		System.out.println(newUser.toString());
		if(utilities.FileHandler.WriteNewUserToFile(newUser))
		{
			userCreatedMessage = "User created successfully";			
		}
		else
		{
			userCreatedMessage = "User not created";
		}
		request.getSession().setAttribute("userCreatedMessage", userCreatedMessage);				
		RequestDispatcher dispatcher = request.getRequestDispatcher("User/SignUp.jsp");
		dispatcher.forward(request, response);
		return;
	}

}
