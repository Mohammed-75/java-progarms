package com.edu;

import java.util.Scanner;

public class conditional {
           public static void main(String Args[]){
        	   int age;
        	   Scanner sc = new Scanner(System.in);
        	   age = sc.nextInt();
        	   System.out.println("Enter your age" + age );
        	   
        	   if(age<=18) {
        		   System.out.println("you are eligible for voting");
        		   
        	   }
        	   else if(age==0) {
        		   System.out.println("invalid creditials");
        	   }
        	   else if(age>=0) {
        		   System.out.println("you age in negative");
        		   
        	   }
        	   else {
        		   System.out.println("")
        	   }
        		   
        		   
           }
}
