package Oops;

public class Casting1 {

	void send() {
		System.out.println("sending"); //Upcasting
	}
	
	public static void main(String[] args) {
		int a=10;
		double b=a;  //Implicit
		System.out.println(b);
		
		
		
		double c=20.5;  //Explicit
		int d=(int)c;
		System.out.println(d);

	}

}
