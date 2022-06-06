package com.nt.comp;

public class Car {
	private String regNo;
	private String owner;
	private String model;
	private String engineNo;
	private String type;
	private String engineCC;
	private String color;
	private String fuelType;
	private String company;
	public void setCompany(String company) {
		this.company = company;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setEngineCC(String engineCC) {
		this.engineCC = engineCC;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	@Override
	public String toString() {
		return "Car [regNo=" + regNo + ", owner=" + owner + ", model=" + model + ", engineNo=" + engineNo + ", type="
				+ type + ", engineCC=" + engineCC + ", color=" + color + ", fuelType=" + fuelType + ", company="
				+ company + "]";
	}
	

}
