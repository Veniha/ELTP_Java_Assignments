package com.psl.training;

import java.util.Scanner;

public class CalculateProfit {
	static Scanner scan = new Scanner (System.in);
	static float calculateProfit( int numAttendees) {
		float income, attendee = .50f;
		int ticket = 5, performance = 20;
		income = ( numAttendees * ticket)-((numAttendees * attendee ) + performance);
		return income;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Income :");		
		int num = scan.nextInt();
		float income = calculateProfit(num);
		System.out.println("Income is "+income);
	}
}
