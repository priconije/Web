package model;

import enums.UserRole;

public class Administrator extends User {

	public Administrator() { }

	public Administrator(String username, String password, String firstName, String lastName, UserRole userRole,
			String phoneNumber, String email, String registrationDate, String city) {
		super(username, password, firstName, lastName, userRole, phoneNumber, email, registrationDate, city);
	}

}
