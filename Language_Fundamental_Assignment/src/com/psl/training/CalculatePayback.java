package com.psl.training;

import java.util.Scanner;

public class CalculatePayback {
	static Scanner scan = new Scanner (System.in);
	static double calPayback(double amount) {
		double pb;
		if(amount<=500){
			pb=(amount/100)*0.25;
		}
		else{
			pb=(500/100)*0.25;
			amount=amount-500;
			if(amount<=1000){
				pb=pb+(amount/100)*0.50;
			}
			else{
				pb=pb+(1000/100)*0.50;
				amount=amount-1000;
				
				if(amount<=1000)
				{
					pb=pb+(amount/100)*0.75;
				}
				else
				{
					pb=pb+(1000/100)*0.75;
					amount=amount-1000;
				
					if(amount>=1)
					{
						pb=pb+(amount/100)*1.0;
					}
				}
			}
		}
		return pb;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Amount :");
		double amount = scan.nextDouble();
		double payback = calPayback(amount);
		System.out.println("Payback amount is "+payback);
	}

}
