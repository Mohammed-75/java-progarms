package com.edu;
import java.util.Scanner;
public class electricity_bill {
	public static void main(String ards[]) {
		
		System.out.println("Enter the number units consumed");
		
		Scanner sc = new Scanner(System.in);
		int units = sc.nextInt();
		
		
		float amount;
		
		if(units <= 200) {
			amount = units * 3.80f;
		}
		else if(units >=200 && units <=300) {
			amount = 200*3.80f + (units - 200)* 4.40f;
		}
		else if(units >=300 && units <=400) {
			amount = 200*3.80f + 100 *4.40f+(units - 300)* 5.10f;
		}
		else  {
			amount =200*3.80f + 100 *4.40f+ 100*5.10f+(units - 400)* 5.80f;
		}
		System.out.println("Your Electrity bill is " + amount );
	}

}
