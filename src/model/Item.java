package model;

import enums.Quantity;

public class Item {
	private String name;
	private String price;
	private String description;
	private Quantity quantity;
	
	public Item(String name, String price, String description, Quantity quantity) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
		this.quantity = quantity;
				
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Quantity getQuantity() {
		return quantity;
	}

	public void setQuantity(Quantity quantity) {
		this.quantity = quantity;
	}
	
	//TODO: Override toString for file
	@Override
	public String toString() {
		return super.toString();
	}
}
