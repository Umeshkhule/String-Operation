package com.vasyerp;

public class Bike {
	int bikeNo;
	String bikeName;
	String bikeColor;
	public Bike(int bikeNo, String bikeName, String bikeColor) {
		super();
		this.bikeNo = bikeNo;
		this.bikeName = bikeName;
		this.bikeColor = bikeColor;
	}
	@Override
	public String toString() {
		return "Bike [bikeNo=" + bikeNo + ", bikeName=" + bikeName + ", bikeColor=" + bikeColor + "]";
	}
}
