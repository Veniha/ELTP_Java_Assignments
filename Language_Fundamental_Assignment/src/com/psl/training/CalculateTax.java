package com.psl.training;

import java.util.Scanner;

public class CalculateTax {
	static Scanner scan = new Scanner (System.in);
	static double calTax(int gp) {
		double percent,tax;
		if(gp<=240){
			percent=0;
		}
		else if(gp>240&&gp<=480){
			percent=15;
		}
		else{
			percent=28;
		}
		tax = (gp*percent)/100.0;
		return tax;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Gross Profit :");
		int gp = scan.nextInt();
		double tax = calTax(gp);
		System.out.println("Tax is "+tax);
	}


}
