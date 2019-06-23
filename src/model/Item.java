package model;

public class Item {

	private String name;
	private double price;
	private String description;
	private int quantity;
	//image
	
	public Item() {
	}
	
	public Item(String name, double price) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = 1;
		this.description = "";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return name + ";" + price + ";" + quantity + ";" + description;
	}
}
