package com.psl.training;

import java.util.Scanner;

public class CheckKeywoed {
	static Scanner scan = new Scanner (System.in);
	static String[] initProductNames(){
		System.out.print("Enter number of products : ");
		int n = scan.nextInt();
		String[] products = new String[n];
		for(int i=0;i<n;i++){
        		products[i] = scan.nextLine() ;
                }
		return products;
	} 
	static boolean isPresent(String[] productNames, String keyword) {
                for (int i = 0; i < productNames.length; i++){
                        if (keyword.equals(productNames[i]))
                            return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome");
		
		String[] products = initProductNames();
		System.out.print("Enter the product you want to search : ");
		String keyword = scan.nextLine();
		boolean isTrue = isPresent(products, keyword);
		if(isTrue==true){
			System.out.println("The keyword is present in names");
		}
		else{
			System.out.println("The keyword is not present in names");
		}
	}

}
