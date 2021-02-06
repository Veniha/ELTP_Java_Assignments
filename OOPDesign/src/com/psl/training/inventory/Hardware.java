package com.psl.training.inventory;

public abstract class Hardware implements IProduct {
	
	String dimensions, capacity, brand, power_supply_requirements, battery ;
	public Hardware(String dimensions,String capacity,String brand,String power_supply_requirements,String battery ) {
		this.dimensions=dimensions;
		this.capacity=capacity;
		this.brand=brand;
		this.power_supply_requirements=power_supply_requirements;
		this.battery=battery;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("These are Hardware Products. ");
	}
	public void details() {}
}
