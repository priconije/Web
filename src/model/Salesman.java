package model;

import enums.UserRole;

public class Salesman extends User {

	//list of all published ads
	//list of delivered items
	//list of messages
	//likes
	//dislikes
	public Salesman() {
		}

	public Salesman(String username, String password, String firstName, String lastName, UserRole userRole,
			String phoneNumber, String email, String registrationDate, String city) {
		super(username, password, firstName, lastName, userRole, phoneNumber, email, registrationDate, city);
	}

}
