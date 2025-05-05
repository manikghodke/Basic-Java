package Oops;

public class CTP_Overloading {

	void jk() {

		System.out.println("jk");
	}

	void jk(int a) {
		
	System.out.println(a);

}

	public static void main(String[] args) {
		CTP_Overloading k=new CTP_Overloading();
		k.jk();
		k.jk(7);

	}

}
