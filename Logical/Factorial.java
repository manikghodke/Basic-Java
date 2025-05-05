package Logical;

public class Factorial {

	public static void main(String[] args) {
		int a = 5;
		int f = 1;
		for (int i = 1; i <= a; i++) {
			f = f * i;

		}
		System.out.println(f);
		System.out.println();

		/////////////////////////////////////////////////////////////////////
		int n = 10; // Number of terms to print
		int s1 = 0;
		int s2 = 1;

		System.out.println("Fibonacci Series up to " + n + " terms:");

		for (int i1 = 0; i1 < n; i1++) {
			System.out.print(s1 + " ");

			int t = s1 + s2;
			s1 = s2;
			s2 = t;
		}

	}

}
