package com.psl.training;

import java.util.Scanner;

public class CalculatePrimes {
	static 	Scanner scan = new Scanner (System.in);
	static int[] calPrimes(int a,int b) {
		int i,j, flag,index=0;
		int[] array= new int[100];
		for (i = a; i <= b; i++) {
	        	if (i == 1 || i == 0)
	                	continue;
	         	flag = 1;
	                for (j = 2; j <= i / 2; ++j) {
	                	if (i % j == 0) {
	                		flag = 0;
	                        	break;
	                	}
			}
	        	if (flag == 1){
	        		array[index]=i;
				index++;
			}
		}
		return array;
	}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int i;
			System.out.println("Enter Numbers to find Prime values between them :");
			int a = scan.nextInt();
			int b = scan.nextInt();
			int[] primes = calPrimes(a,b);
			System.out.println("Prime values are :");
			for(i=0;primes[i]!=0;i++){
				System.out.print(primes[i]+" ");
			}

		}
}
