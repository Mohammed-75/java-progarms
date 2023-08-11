package com.edu;

import java.util.Scanner;

public class discount {

	public static void main(String[] args) {
		
		String name;
		float amount, discount = 0 , afterDis;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name");
		name = sc.nextLine();
		
		System.out.println("Enter Amount");
		amount = sc.nextFloat();
		
		if(amount>=0 && amount <=10000) {
			discount = amount * 0.05f;
		}
		else if(amount>=10000 && amount <=20000) {
			discount = amount * 0.10f;
		}
        else if(amount>=20000 && amount <=35000) {
        	discount = amount * 0.15f;
		}
        else{
        	discount = amount * 0.20f;
		}
		
		
		afterDis = amount - discount;
		System.out.println(name +" Purchased amount is "+ amount);
		
		System.out.println("Your Discount is "+ discount);
		
        System.out.println("Your Final price is "+ afterDis);
	}

}
