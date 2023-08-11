package com.edu;

import java.util.Scanner;

class Employee{
	  int employeeid;
	  String employeename;
	  int employeesalary;
	 

	void employeeData() {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter name");
		  employeename =sc.nextLine();
		  
		  System.out.println("Enter id");
		  employeeid= sc.nextInt();
		  
		  System.out.println("Enter salary");
		  employeesalary= sc.nextInt();
		  
	  }
	  
	  void displayEmployeeDetails(){
	     System.out.println("Employee id ="+employeeid);
	     System.out.println("Employee name="+ employeename);
	     System.out.println("Employee age ="+employeesalary);
	   }
  // @Override
//	public String toString() {
	//	return "Employee [employeeid=" + employeeid+ ", employeename=" +  employeename+ ", employeesalary=" + employeesalary + "]";
	//}
	  
}
public class Employee_details{
	     public static void main(String args[]){
	              System.out.println("Main");
	             //1st object
	              Employee employee1 = new Employee();
	              
	                       employee1.employeeData();
	                       employee1.displayEmployeeDetails();
	                                           System.out.println(employee1);
	             //2nd object     
	              Employee  employee2 = new Employee ();
	              
	                        employee2.employeeData();
	                        employee2.displayEmployeeDetails();
	                                           System.out.println(employee2);
	         }
}
