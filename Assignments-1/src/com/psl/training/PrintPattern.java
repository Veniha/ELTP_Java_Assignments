package com.psl.training;

import java.util.Scanner;

public class PrintPattern {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("How many rows you want in this number pattern?"); 
        	int rows = scan.nextInt();
		printNumberPattern(rows);
		System.out.println("How many rows you want in this string pattern?"); 
    	rows = scan.nextInt();
    	printStringPattern(rows);
    	System.out.println("Enter String to print without spaces : ");
    	String string = scan.nextLine();    
    	printStr(string);   
	}
	
	public static void printNumberPattern(int rows) {
		for (int i = 1; i <= rows; i++) {
            		for (int j = 1; j <= i; j++) { 
                		System.out.print(j+" "); 
            		} 
            	System.out.println(); 
        	} 
        	for (int i = rows-1; i >= 1; i--){
            		for (int j = 1; j <= i; j++){
                		System.out.print(j+" ");
            		} 
            		System.out.println();
        	} 	
	}

	
	public static void printStringPattern(int rows) {
		for (int i = 1; i <= rows; i++) {
            		for (int j = 1; j <= i; j++) { 
                		System.out.print(j+" "); 
            		} 
            	System.out.println(); 
        	} 
        	for (int i = rows-1; i >= 1; i--){
            		for (int j = 1; j <= i; j++){
                		System.out.print(j+" ");
            		} 
            		System.out.println();
        	} 	
	}
	
	public static void printStr(String string) 
	{
		for(int i = 0; i < string.length(); i++) {    
            		if(string.charAt(i) != ' ')    
                	  System.out.print(string.charAt(i));
			if(string.charAt(i) == ' ')    
                	  System.out.println();  
        	} 	
	}

}
