package com.psl.training;

import java.util.Scanner;

public class CalculateIntrest {
	static Scanner scan = new Scanner (System.in);
		static double calInterest(int amt) {
			double percent,interest;
			if(amt<=1000){
				percent=4;
			}
			else if(amt>1000&&amt<=5000){
				percent=4.5;
			}
			else{
				percent=5;
			}
			interest = (amt*percent)/100.0;
			return interest;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Enter Deposit :");
			int deposit = scan.nextInt();
			double interest = calInterest(deposit);
			System.out.println("Interest is "+interest);
		}

}
