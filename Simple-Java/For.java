package Basic_Java;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 10; i++) {
			System.out.print(i);
		}
		System.out.println(" ");
///////////////////////////////////////////////////////////////////////
		int n = 1;
		while (n <= 5) {

			System.out.print("While Loop");
			++n;
		}
		
		System.out.println(" ");

//////////////////////////////////////////////////////////////////////////
		int k = 1;
		do {
			System.out.print(k);
			++k;
		} while (k <= 5);

	}

}
