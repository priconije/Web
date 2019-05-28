package model;

import enums.UserRole;

public abstract class User {	
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private UserRole userRole;
	private String phoneNumber;
	private String email;
	private String registrationDate;
	private String city;
	
	public User() {}
	public User(String username, String password, String firstName, String lastName, UserRole userRole,
			String phoneNumber, String email, String registrationDate, String city) {
		super();
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userRole = userRole;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.registrationDate = registrationDate;
		this.city = city;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public UserRole getUserRole() {
		return userRole;
	}

	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}

	@Override
	public String toString() {
		return username + ";" + password + ";" + firstName + ";" + lastName + ";" + userRole + ";" + phoneNumber + ";" + email + ";" + registrationDate + ";" + city + ";";
	}
}

