package com.edu;
import java.util.Scanner;

public class largest {
      public static void main(String Args[]) {
    	  int a, b, c, d , l;
    	  
    	  System.out.println("enter the numbers");
    	  
    	  Scanner sc = new Scanner(System.in);
    	  a= sc.nextInt();
    	  b= sc.nextInt();
    	  c= sc.nextInt();
    	  d= sc.nextInt();
    	  
    	  l = (a>b &&a>c && a>d)?a:(b>a&&b>c&& b>d)?b:(c>a&& c>b && c>d)?c:d;
   
    	  System.out.println("the largest of "+a+","+b+", "+c+ "and"+d+ "is " +l);
    	  
    	  
    	  
    	  
      }
}
