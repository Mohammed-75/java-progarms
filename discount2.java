package com.edu;

import java.util.Scanner;

public class discount2 {

	public static void main(String[] args) {
		String name;
		float amount, discount = 0 , afterDis;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name");
		name = sc.nextLine();
		
		System.out.println("Enter Amount");
		amount = sc.nextFloat();
		
		if(amount>=0 && amount <=1000) {
			discount = amount * 0.02f;
		}
		else if(amount>=1000 && amount <=3000) {
			discount = amount * 0.10f;
		}
        else{
        	discount = amount * 0.15f;
		}
		
		
		afterDis = amount - discount;
		System.out.println(name +" Purchased amount is "+ amount);
		
		System.out.println("Your Discount is "+ discount);
		
        System.out.println("Your Final price is "+ afterDis);
	}

}
