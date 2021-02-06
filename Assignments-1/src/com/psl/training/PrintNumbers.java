package com.psl.training;

import java.util.Scanner;

public class PrintNumbers {
	static Scanner scan = new Scanner(System.in);
	public static void printNum(int[] a, int Size) 
	{
		int i;
		for(i = 0; i < Size; i++)
		{
			if(a[i] % 2 == 0 && a[i]%5==0)
			{
				System.out.print(a[i]+" "); 
			}
		}
					
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Size, i;
		System.out.print(" Please Enter Number of elements in an array : ");
		Size = scan.nextInt();	
		
		int [] a = new int[Size];
		
		System.out.print(" Please Enter " + Size + " elements of an Array  : ");
		for (i = 0; i < Size; i++)
		{
			a[i] = scan.nextInt();
		}
		printNum(a,Size);   
	}

}
