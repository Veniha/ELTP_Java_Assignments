package com.psl.training.inventory;

public class Computer extends Hardware implements IProduct {
	
	public static final int productID = 2;
	public static final int serialNumber = 002;
	public static final String productName = "Computer";

	
	Computer(String dimensions,String capacity,String brand,String power_supply_requirements,String battery ) {
		super(dimensions, capacity, brand, power_supply_requirements, battery);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub

		super.display();
		System.out.println("This is a computer..");
	}
	
	@Override
	public void details() {
		System.out.println("Brand : "+brand);
		System.out.println("Dimensions : "+dimensions);
		System.out.println("Capacity : "+capacity);
		System.out.println("Power Supply Requirements : "+power_supply_requirements);
		System.out.println("Battery : "+battery);
	}

}
