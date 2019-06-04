package model;

public class Review {

	private Ad ad;
	private User reviewer;
	private String title;
	private String reviewMessage;
	//image
	private boolean isItemAsDescribed;
	private boolean isArrangementMet;
	
	public Review() {
	}

	public Review(Ad ad, User reviewer) {
		super();
		this.ad = ad;
		this.reviewer = reviewer;
	}

	public Ad getAd() {
		return ad;
	}

	public void setAd(Ad ad) {
		this.ad = ad;
	}

	public User getReviewer() {
		return reviewer;
	}

	public void setReviewer(User reviewer) {
		this.reviewer = reviewer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getReviewMessage() {
		return reviewMessage;
	}

	public void setReviewMessage(String reviewMessage) {
		this.reviewMessage = reviewMessage;
	}

	public boolean isItemAsDescribed() {
		return isItemAsDescribed;
	}

	public void setItemAsDescribed(boolean isItemAsDescribed) {
		this.isItemAsDescribed = isItemAsDescribed;
	}

	public boolean isArrangementMet() {
		return isArrangementMet;
	}

	public void setArrangementMet(boolean isArrangementMet) {
		this.isArrangementMet = isArrangementMet;
	}

	@Override
	public String toString() {
		// TODO Implement Review toString
		return super.toString();
	}
	
}
