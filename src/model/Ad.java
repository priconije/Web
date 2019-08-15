package model;

import java.util.Date;
import java.util.UUID;

public class Ad {

	private UUID adID;
	private String title;
	private Item item;
	private String description;
	//likes
	//dislikes
	private Date postedOn;
	private Date expiresOn;
	private boolean isActive;
	//list of reviews
	private String city;
	
	public Ad(String title, Item item) {
		this.title = title;
		this.item = item;
		this.description = "";
		this.postedOn = new Date();
		this.isActive = true;
		this.city = "";
		adID = UUID.randomUUID();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getPostedOn() {
		return postedOn;
	}

	public void setPostedOn(Date postedOn) {
		this.postedOn = postedOn;
	}

	public Date getExpiresOn() {
		return expiresOn;
	}

	public void setExpiresOn(Date expiresOn) {
		this.expiresOn = expiresOn;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}	
	
	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public UUID getAdID() {
		return adID;
	}

	@Override
	public String toString() {
		
		return adID + ";" + title + ";" + item.getItemID().toString();
	}
}
