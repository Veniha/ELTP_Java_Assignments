package com.psl.training;

import java.util.Scanner;

public class FindMaximum {
	static Scanner scan = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 3 values :");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int maximum = calMax(a,b,c);
		System.out.println("Maximum value is "+maximum);

	}
	
	static int calMax(int x,int y,int z) {
		return x>y?(x>z?x:z):(y>z?y:z);
	}

}
