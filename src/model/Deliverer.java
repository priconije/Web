package model;

import enums.UserRole;

public class Deliverer extends User {
	
	//TODO: List of Orders and vehicles
	
	public Deliverer() { }

	public Deliverer(String username, String password, String firstName, String lastName, UserRole userRole,
			String phoneNumber, String email, String registrationDate) {
		super(username, password, firstName, lastName, userRole, phoneNumber, email, registrationDate);
		
	}
	
	//TODO: Override toString for file
	@Override
	public String toString() {
		return super.toString();
	}

}
