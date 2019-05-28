package model;

import enums.VehicleType;

public class Vehicle {
	private String make;
	private String model;
	private VehicleType vehicleType;
	private String licencePlateNo;
	private String productionYear;
	private boolean currentlyInUse;
	private String note;
	
	public Vehicle(String make, String model, VehicleType vehicleType, String licencePlateNo, String productionYear,
			boolean currentlyInUse, String note) {
		super();
		this.make = make;
		this.model = model;
		this.vehicleType = vehicleType;
		this.licencePlateNo = licencePlateNo;
		this.productionYear = productionYear;
		this.currentlyInUse = currentlyInUse;
		this.note = note;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public VehicleType getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getLicencePlateNo() {
		return licencePlateNo;
	}

	public void setLicencePlateNo(String licencePlateNo) {
		this.licencePlateNo = licencePlateNo;
	}

	public String getProductionYear() {
		return productionYear;
	}

	public void setProductionYear(String productionYear) {
		this.productionYear = productionYear;
	}

	public boolean isCurrentlyInUse() {
		return currentlyInUse;
	}

	public void setCurrentlyInUse(boolean currentlyInUse) {
		this.currentlyInUse = currentlyInUse;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	//TODO: Override toString for file
	@Override
	public String toString() {
		return super.toString();
	}
}
