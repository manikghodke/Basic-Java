package Basic_Java;

public class Static_NonStatic_Method {

	static int a;
	int b = 10;

	public static void show() {

		a = 10;
		System.out.println(a);
	}

	public void disp() {

		b = 20;
		System.out.println(b);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Static_NonStatic_Method.show();

		Static_NonStatic_Method k = new Static_NonStatic_Method();
		k.disp();

	}

}
