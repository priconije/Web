package model;

import enums.UserRole;

public class Customer extends User {

<<<<<<< HEAD
	public Customer(String username, String password, String firstName, String lastName, UserRole userRole,
			String phoneNumber, String email, String registrationDate) {
		super(username, password, firstName, lastName, userRole, phoneNumber, email, registrationDate);
		// TODO Auto-generated constructor stub
	}
=======
	//list of ordered items(ad)
	//list of successully delivered items
	//list of favourite ads
	
	public Customer() {
	}

	public Customer(String username, String password, String firstName, String lastName, UserRole userRole,
			String phoneNumber, String email, String registrationDate, String city) {
		super(username, password, firstName, lastName, userRole, phoneNumber, email, registrationDate, city);
	}
	
	
>>>>>>> 981a7bc4a24b58a554788ef0ed4a0613ad2bfc45

}
