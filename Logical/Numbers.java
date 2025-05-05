package Logical;

public class Numbers {
	public static void main(String[] args) {
		
	
	int p = 19;
	int k = 0;

	for (int i = 2; i < p; i++) {
		if (p % i == 0) {
			k = k + 1;
		}
	}
	if (k == 0) {
		System.out.println("Prime Number");
	} else {
		System.out.println("Not prime number");
	}
	System.out.println();
	
	///////////////////////////////////////////////////////////////////
	int num = 252;
	int sum = 0;
	int rem;
	int temp = num;
	while (num > 0) {
		rem = num % 10;
		sum = sum * 10 + rem;
		num = num / 10;
	}
	if (sum == temp) {
		System.out.println("Number is palidrom");

	} else {
		System.out.println("Number is not palidrom");
	}
	System.out.println();
	///////////////////////////////////////////////////////////
	
	int num1 = 153;// 27+125+1=153
	int temp1 = num1;
	int sum1 = 0;
	int rem1;
	while (num1 > 0) {
		rem1 = num1 % 10;
		sum1 = sum1 + (rem1 * rem1 * rem1);
		num1 = num1 / 10;

	}
	if (sum1 == temp1) {
		System.out.println("Number is armstrong");
	} else {
		System.out.println("Number is not armstrong");

	}
	System.out.println();
	///////////////////////////////////////////////////////////////////
	int x = 10;
	int y = 20;
	
	// add both the numbers and assign it to first
	x = x + y;
	y = x - y;
	x = x - y;

	System.out.println("after Swapping "+x+" "+y);
	
}}

