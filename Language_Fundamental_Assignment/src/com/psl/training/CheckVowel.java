package com.psl.training;

import java.util.Scanner;

public class CheckVowel {
	static Scanner scan = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input the alphabets :");
		char ch = scan.next().charAt(0);
		boolean isVowel = checkAlpha(ch);
		if(isVowel==true){
			System.out.println("Input alphabet is a vowel.");
		}
		else{
			System.out.println("Input alphabet is not a vowel.");
		}
	}
	static boolean checkAlpha(char alph) {
		if(alph=='a'||alph=='e'||alph=='i'||alph=='o'||alph=='u'||alph=='A'||alph=='E'||alph=='I'||alph=='O'||alph=='U'){
			return true;
		}
		return false;
	}

}
