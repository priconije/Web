package model;

import enums.UserRole;

public class Customer extends User {

	public Customer(String username, String password, String firstName, String lastName, UserRole userRole,
			String phoneNumber, String email, String registrationDate) {
		super(username, password, firstName, lastName, userRole, phoneNumber, email, registrationDate);
		// TODO Auto-generated constructor stub
	}

}
