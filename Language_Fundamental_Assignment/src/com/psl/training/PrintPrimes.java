package com.psl.training;

import java.util.Scanner;

public class PrintPrimes {
	static Scanner scan = new Scanner (System.in);
	void printPrime(int maxVal) {
		int i,num,count=0;
		for(num=2;num<=maxVal;num++){
			count=0;
			for(i=2;i<=num/2;i++){
				if(num%i==0)
					count++;
			}
			if(count<2){
				System.out.print(num+" ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintPrimes demo = new PrintPrimes();
		System.out.println("Enter Maximum Value :");
		int maxVal = scan.nextInt();
		demo.printPrime(maxVal);
	}


}
