package com.psl.training;

import java.util.Scanner;

public class CheckPrimes {
	static Scanner scan = new Scanner (System.in);
	static boolean isPrimeNumber( int num) {
		int i,count=0;
		for(i=2;i<=num/2;i++){
			if(num%i==0)
				count++;
		}
		if(count<2){
			return true;
		}
		else{
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Number to check if it is Prime or Non Prime :");
		int num = scan.nextInt();
		boolean isPrime = isPrimeNumber(num);
		if(isPrime==true){
			System.out.println("Given number is a prime number.");
		}
		else{
			System.out.println("Given number is not a prime number.");
		}
	}

}
