package com.psl.training;

import java.util.Scanner;

public class CalculateBill {
	static Scanner scan = new Scanner (System.in);
	static double calBill(int units, int type) {
		double cost = 0,bill;
		if(type==1){
			if(units<=100){
				cost = 4;
				bill = units * cost;
				if( bill<250){
					return 250;
				} 
			}
			else if(units>100&&units<=300){
				cost = 4.50;
			}
			else if(units>300&&units<=500){
				cost = 4.75;
			}
			else{
				cost = 5;
			}
		}
		else if(type==2){
			if(units<=100){
				cost = 4.25;
				bill = units * cost;
				if( bill<350){
					return 350;
				} 
			}
			else if(units>100&&units<=300){
				cost = 4.75;
			}
			else if(units>300&&units<=500){
				cost = 5.25;
			}
			else{
				cost = 5;
			}
		}
		else{
			System.out.println("Invalid type of connection");
		}
		bill = units * cost;
		return bill;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Select type of connections:");
		System.out.println("1.Domestic");
		System.out.println("2.Commercial");
		int type = scan.nextInt();
		System.out.println("Enter number of units :");
		int units = scan.nextInt();
		double bill = calBill(units,type);
		System.out.println("Bill is "+bill);
	}


}
