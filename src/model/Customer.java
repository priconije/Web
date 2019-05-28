package model;

import enums.UserRole;

public class Customer extends User {
	//TODO: List of customer Orders and favourite restaurants 
	//private List<Order> orders;
	//private List<Restaurant> restarants;
	
	public Customer() { }

	public Customer(String username, String password, String firstName, String lastName, UserRole userRole,
			String phoneNumber, String email, String registrationDate) {
		super(username, password, firstName, lastName, userRole, phoneNumber, email, registrationDate);
		
	}
	
	//TODO: Override toString for file
	@Override
	public String toString() {
		return super.toString();
	}

}
