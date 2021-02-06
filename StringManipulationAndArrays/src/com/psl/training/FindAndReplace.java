package com.psl.training;

import java.util.Scanner;

public class FindAndReplace {
	static Scanner sc=new Scanner(System.in);
	
	public static String FindReplace(String originalString,String findString,String replaceString){
		String[] array=originalString.split(" ");
		String newString="";
		for(int i=0;i<array.length;i++){
				if(array[i].equals(findString)){
					array[i]=replaceString;
				}
		}
		for(int i=0;i<array.length;i++){
			newString+=array[i]+" ";
		}
		return newString;
	}

	public static void main(String[] args) {
		System.out.println("Enter the original String");
		String originalString=sc.nextLine();
		System.out.println("Enter the string to find");
		String findString=sc.nextLine();
		System.out.println("Enter the string to replace");
		String replaceString=sc.nextLine();
		String result=FindAndReplace.FindReplace( originalString , findString , replaceString);		
		System.out.println("String After Replacement is "+result);
	}
}