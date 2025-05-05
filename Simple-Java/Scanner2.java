package Basic_Java;
import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {

	
		int a;
		System.out.println("Enter value");
		Scanner k=new Scanner(System.in);
		a=k.nextInt();
		System.out.println("Value is " + a);
		System.out.println(" ");
		
//////////////////////////////////////////////////////////////
		String b;
		System.out.println("Enter name");
		Scanner j=new Scanner(System.in);
		b=j.nextLine();
		System.out.println("Name is " + b);
	}

}
