package enums;

public class Quantity {
	public enum Unit { GRAM, MILILITER}
	
	private int quantity;
	private Unit unit;
	
	public Quantity(int quantity, Unit unit) {
		super();
		this.quantity = quantity;
		this.unit = unit;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Unit getUnit() {
		return unit;
	}

	public void setUnit(Unit unit) {
		this.unit = unit;
	}
	
	public String toString()
	{
		switch(this.unit)
		{
			case GRAM:
				return quantity + "g";
			case MILILITER:
				return quantity + "ml";
			default:
				return "0";
		}
		
	}

}
