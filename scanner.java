package com.edu;

import java.util.Scanner;

public class scanner {
	
		public static void main(String[] args) {
			System.out.println("Employee Details");
			int id, age;
			String name, dept;
			float salary;  char gender;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter employee id");
			id = sc.nextInt();
			
			System.out.println("Enter employee name");
			name = sc.nextLine(); name = sc.nextLine();
					
			System.out.println("Enter employee age");
			age = sc.nextInt();
					
			System.out.println("Enter employee salary");
			salary = sc.nextFloat();
					
			System.out.println("Enter employee Male as M or Female as F");
			gender = sc.next().charAt(0);
					
			System.out.println("Enter employee dept");
			dept = sc.nextLine(); dept = sc.nextLine();
			
			System.out.println("Employee ID is  " + id);
			System.out.println("Employee Name is  " + name);
			System.out.println("Employee Age is  "+ age);
			System.out.println("Employee Salary is  "+ salary);
			System.out.println("Employee Gender is  "+ gender);
			System.out.println("Employee Department is  "+ dept);
	}

}
