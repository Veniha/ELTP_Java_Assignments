package com.psl.training;

import java.util.Scanner;

public class CharacterSum {
	static Scanner scan = new Scanner(System.in);
	public static int charSum(String string) 
	{
		 int count = 0;        
        	//Counts each character except space    
        	for(int i = 0; i < string.length(); i++) {    
            		if(string.charAt(i) != ' ')    
                	count++;    
        	}    
		return count;
					
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = scan.nextLine();      
            int count=charSum(string);
        System.out.println("Total number of characters in a string: " + count);    
	}
}
