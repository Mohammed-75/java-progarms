package com.edu;
import java.util.Scanner;
public class largest_num {
	public static void main (String args[]) {
		System.out.println("enter your mark");
		Scanner mark = new Scanner(System.in);
		int a;
		a = mark.nextInt();
		
		if(a==100 && a>=90) {
			System.out.println("Grade A");
		}
		else if(a<=89 && a>=70) {
			System.out.println("Grade B");
		}
		else if(a<=69 && a>=50) {
			System.out.println("Grade C");
			
		}
		else if(a<=49 && a==0) {
			System.out.println("Grade D");
		}
		else if(a>100){
			System.out.println("INVALID");
		}
		else {
			System.out.println("FAIL");
		}
	} 

	

}
/*Marks                              Grade
90 - 100                             Grade A
70 - 89                               Grade B
50-69                                 Grade C
0 - 49                                 Grade D
0<marks>100                    Invalid marks*/