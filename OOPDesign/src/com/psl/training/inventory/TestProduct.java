package com.psl.training.inventory;

public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IProduct[] p = new IProduct[2];
		for(int i=0;i<2;i++) {
			if(i%2==0) {
				p[i] = new Microsoft("windows 10","50MB","W10");
			}
			else {
				p[i] = new Computer("13 inch", "500GB", "Apple", "150wt","1200");
			}
		}
		for(int i=0;i<2;i++) {
				p[i].display();
				p[i].details();
		}
	}

}
