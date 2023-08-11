package com.edu;

import java.util.Scanner;

public class ebillByEncapsule {
	
		
			String name;
			int units;
			float amount;
			
			void inputUnits() {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter customer name");
				 name = sc.nextLine();
				
				System.out.println("Enter units consumed");
				units = sc.nextInt();
				
			}

			void calculateBill() {
				
				
						if(units>=0 && units<=200) {  
							  
							 amount = units * 3.80f;
						}
						
						
						                                          
						else if(units>200 && units<=300) {
							amount = 200 * 3.80f+(units-200)*4.40f;
							
						}
						else if(units>300 && units<=400) {
							amount = 200*3.80f+100*4.40f+(units-300)*5.10f;
						}
						else {
							amount = 200*3.80f+100*4.40f+100*5.10f+(units-400)*5.80f;
						}
						
			}
						void displayData() {
							System.out.println("Customer Name:"+name);
							System.out.println("Units Consumed "+units);
							System.out.println("Amount to pay Rs."+amount);
						
			}
			public static void main(String[] args) {
				
				System.out.println("Main method");
				ebillByEncapsule ebill= new ebillByEncapsule();
				ebill.inputUnits();
				ebill.calculateBill();
				ebill.displayData();
				
				
			}

		}

	}
	

}
