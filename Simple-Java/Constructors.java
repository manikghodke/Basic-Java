package Basic_Java;

public class Constructors {
	int a;
	String b;

	Constructors() {

		a = 10;
		b = "Manik";
	}

	Constructors(int c, String d) {
		System.out.println(c);
		System.out.println(d);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructors k = new Constructors();
		System.out.println(k.a);
		System.out.println(k.b);
		Constructors j = new Constructors(30, "PU");

	}

}
