package model;

public class Category {
	
	private String categoryName;
	private String descriotion;
	
	public Category() {
		
	}
	
	public Category(String categoryName, String descriotion) {
		super();
		this.categoryName = categoryName;
		this.descriotion = descriotion;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getDescriotion() {
		return descriotion;
	}

	public void setDescriotion(String descriotion) {
		this.descriotion = descriotion;
	}

	@Override
	public String toString() {
		return categoryName + ";" + descriotion + ";";
	}

	
}
