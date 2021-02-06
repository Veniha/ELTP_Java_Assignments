package com.psl.training.inventory;

public abstract class Software implements IProduct {

	String os;
	String memory;
	String license_key;
	public Software(String os,String memory,String license_key){
		this.os = os;
		this.memory = memory;
		this.license_key = license_key;
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("These are Software Products. ");
	}
	public void details() {}
}
