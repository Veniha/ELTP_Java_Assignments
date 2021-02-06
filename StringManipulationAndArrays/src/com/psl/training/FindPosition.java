package com.psl.training;

import java.util.Scanner;

public class FindPosition {
	static Scanner scan = new Scanner(System.in);
	static int findPosition(int num,int[]nos){
		// split the string by spaces in a 
    		if (nos == null) { 
          	    return -1; 
  	        } 
          	int len = nos.length; 
  	        int i = 0; 
  	        while (i < len) { 
            	if (nos[i] == num) { 
                	return i; 
            	} 
            	else { 
                	i = i + 1; 
            	} 
        	} 
        	return -1; 
    	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the number of elements you want to store: ");  
		int n=scan.nextInt();  
		int[] array = new int[10];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  { 
				array[i]=scan.nextInt();  
		} 
		System.out.print("Enter the number you want to find: "); 
		int num = scan.nextInt();
		int pos = findPosition(num,array);
		if(pos==-1){
			System.out.print("The number is not in the list. ");
		}
		else{
    			System.out.println("position of number '"+num+"' is "+pos);
		} 
	}
}
