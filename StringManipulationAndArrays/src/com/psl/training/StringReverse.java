package com.psl.training;

import java.util.Scanner;

public class StringReverse {
	static Scanner scan = new Scanner(System.in);
	static String  makeReverse(String str) {
		String revstr="";
		char ch =' ';
		int substr = 0, i=0, j=0, index=0;
		System.out.println("Text before reversing    :    " + str);
          	for(i=0; i<str.length(); ){
           		index = str.indexOf(ch,substr);
            		for(j=index-1; j>=substr; j--){
                		revstr += str.charAt(j);   
			}
            		if(index != -1){   
                		substr = index+1;
                		i= substr;
                		revstr += " ";
            		}
            		else{
                		break;           
			}
		}   
        	for(int n=str.length()-1; n>=substr; n--){
            		revstr += str.charAt(n);
		}
		return revstr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = scan.nextLine();
    		System.out.println("reverse string is "+makeReverse(str)); 
	}
}
