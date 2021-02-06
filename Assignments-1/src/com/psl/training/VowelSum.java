package com.psl.training;

import java.util.Scanner;

public class VowelSum {
		static Scanner scan = new Scanner(System.in);
		public static int vowelSum(String string) 
		{
			 int count = 0;    
	        	for(int i = 0; i < string.length(); i++) {
				char c = string.charAt(i);   
	            		if( c== 'a'||c== 'e'||c== 'i'||c== 'o'||c== 'u'||c== 'A'||c== 'E'||c== 'I'||c== 'O'||c== 'U')    
	                	count++;    
	        	}    
			return count;
						
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		
			String string = scan.nextLine();    
	       
	            int count=vowelSum(string);
	        System.out.println("Total number of vowels in a string: " + count);    
		}
}
