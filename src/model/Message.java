package model;

import java.util.Date;

public class Message {

	private String adName;
	private User sender;
	private String title;
	private String messageBody;
	private Date sentAt;
	
	public Message() {
	}

	public Message(String adName, User sender) {
		super();
		this.adName = adName;
		this.sender = sender;
	}

	public String getAdName() {
		return adName;
	}

	public void setAdName(String adName) {
		this.adName = adName;
	}

	public User getSender() {
		return sender;
	}

	public void setSender(User sender) {
		this.sender = sender;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMessageBody() {
		return messageBody;
	}

	public void setMessageBody(String messageBody) {
		this.messageBody = messageBody;
	}

	public Date getSentAt() {
		return sentAt;
	}

	public void setSentAt(Date sentAt) {
		this.sentAt = sentAt;
	}
	
	@Override
	public String toString() {
		// TODO Implement Message toString
		return super.toString();
	}
}
