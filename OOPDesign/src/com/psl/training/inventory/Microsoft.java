package com.psl.training.inventory;

public class Microsoft extends Software implements IProduct {
	public static final int productID = 1;
	public static final int serialNumber = 001;
	public static final String productName = "Microsoft";
	
	Microsoft(String os,String memory,String license_key){
		//this.os = os;
		//this.memory = memory;
		//this.license_key = license_key;
		super(os,memory,license_key);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("This is s microsoft product..");
	}
	
	@Override
	public void details() {
		System.out.println("Operating System : "+os);
		System.out.println("Memory : "+memory);
		System.out.println("License Key : "+license_key);
	}
	
}
