package utilities;

import java.util.List;

import model.User;

public final class LogInService {

	private LogInService() {
	}
	
	public static User ValidateUserOnLogIn(String username, String password)
	{
		List<User> users = FileHandler.GetAllUsers();
		for(User user : users)
		{
			if(user.getUsername().equals(username) && user.getPassword().equals(password))
			{
				return user;
			}
		}
		return null;
	}
}
