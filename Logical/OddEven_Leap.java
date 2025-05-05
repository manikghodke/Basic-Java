package Logical;

import java.util.Scanner;

public class OddEven_Leap {

	public static void main(String[] args) {
		int a = 18;

		if (a % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
		
		System.out.println(" ");
		//////////////////////////////////////////////

		Scanner s=new Scanner(System.in);
		  System.out.println("Enter the year ");
		  int year=s.nextInt();
	     if(year %4==0){
	    	 System.out.println("This is a leap year");
		
	}else {
		System.out.println("Not leap year");
	}
	}

}
