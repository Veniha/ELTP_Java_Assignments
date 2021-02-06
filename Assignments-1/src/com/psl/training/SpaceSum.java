package com.psl.training;

import java.util.Scanner;

public class SpaceSum {
	static Scanner scan = new Scanner(System.in);
	public static int spaceSum(String string) 
	{
		 int count = 0;  
        	for(int i = 0; i < string.length(); i++) {    
            		if(string.charAt(i) == ' ')    
                	count++;    
        	}    
		return count;
					
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = scan.nextLine();    
       
            int count=spaceSum(string);
        System.out.println("Total number of spaces in a string: " + count);    
	}
}
