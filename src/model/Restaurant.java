package model;

import java.util.List;

import enums.RestaurantCategory;

public class Restaurant {
	private String name;
	private String address;
	private RestaurantCategory category;
	private List<Item> foodList;
	private List<Item> beverageList;
	
	public Restaurant(String name, String address, RestaurantCategory category) {
		super();
		this.name = name;
		this.address = address;
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public RestaurantCategory getCategory() {
		return category;
	}

	public void setCategory(RestaurantCategory category) {
		this.category = category;
	}

	public List<Item> getFoodList() {
		return foodList;
	}

	public List<Item> getBeverageList() {
		return beverageList;
	}

	//TODO: Override toString for file
	@Override
	public String toString() {
		return super.toString();
	}
	

}
