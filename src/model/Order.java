package model;

import java.util.ArrayList;
import java.util.List;

import enums.OrderStatus;

public class Order {
	private List<Item> itemsToOrder;
	private String dateAndTime; 
	private Customer customer;
	private Deliverer deliverer;
	private OrderStatus status;
	private String note;
	
	public Order(String dateAndTime, Customer customer, Deliverer deliverer, OrderStatus status, String note) {
		super();
		this.dateAndTime = dateAndTime;
		this.customer = customer;
		this.deliverer = deliverer;
		this.status = status;
		this.note = note;
		this.itemsToOrder = new ArrayList<Item>();
	}

	public String getDateAndTime() {
		return dateAndTime;
	}

	public void setDateAndTime(String dateAndTime) {
		this.dateAndTime = dateAndTime;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Deliverer getDeliverer() {
		return deliverer;
	}

	public void setDeliverer(Deliverer deliverer) {
		this.deliverer = deliverer;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public List<Item> getItemsToOrder() {
		return itemsToOrder;
	}
	
	//TODO: Override toString for file
	@Override
	public String toString() {
		return super.toString();
	}
	
}
