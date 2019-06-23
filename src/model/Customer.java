package model;

import enums.UserRole;

public class Customer extends User {
	//list of ordered items(ad)
	//list of successully delivered items
	//list of favourite ads
	
	public Customer() {
	}

	public Customer(String username, String password, String firstName, String lastName, UserRole userRole,
			String phoneNumber, String email, String registrationDate, String city) {
		super(username, password, firstName, lastName, userRole, phoneNumber, email, registrationDate, city);
	}

}
