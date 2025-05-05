package Basic_Java;

public class This {

	int a = 20;
	String b = "Ganesh";

	void demo() {
		System.out.println(this.a);
		System.out.println(this.b);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This k = new This();
		k.demo();

	}

}
