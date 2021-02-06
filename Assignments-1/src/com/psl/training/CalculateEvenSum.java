package com.psl.training;

import java.util.Scanner;

public class CalculateEvenSum {
	static Scanner scan = new Scanner(System.in);
	public static int calEvenSum(int[] a, int Size) 
	{
		int EvenSum=0,i;
		for(i = 0; i < Size; i++)
		{
			if(a[i] % 2 == 0)
			{
				EvenSum = EvenSum + a[i]; 
			}
		}
		return EvenSum;				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Size, i, EvenSum;
		System.out.print(" Please Enter Number of elements in an array : ");
		Size = scan.nextInt();	
		
		int [] a = new int[Size];
		
		System.out.print(" Please Enter " + Size + " elements of an Array  : ");
		for (i = 0; i < Size; i++)
		{
			a[i] = scan.nextInt();
		}
		EvenSum = calEvenSum(a,Size);   
		System.out.println("\n The Sum of Even Numbers in this Array = " + EvenSum); 
	}

}
