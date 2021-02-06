package com.psl.training;

import java.util.Scanner;

public class WordOccurences {
	static Scanner scan = new Scanner (System.in);
	static int check(String sentence,String word) {
		// split the string by spaces in a 
    		String a[] = sentence.split(" "); 
    		int count = 0; 
    		for (int i = 0; i < a.length; i++){ 
    		if (word.equals(a[i])) 
        		count++; 
    		} 
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Sentence :");
		String sentence = scan.nextLine(); 
		System.out.println("Enter word to check occurences :");
    		String word = scan.next(); 
    		System.out.println("number of occurences of word '"+word+"' in sentence '"+sentence+"' is "+check(sentence, word)); 
	}

}
