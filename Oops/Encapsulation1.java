package Oops;

public class Encapsulation1 {
	
	private int a;
	private String b;
	

	public int getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}


	public String getB() {
		return b;
	}


	public void setB(String b) {
		this.b = b;
	}
public static void main(String[] args) {
		
		Encapsulation1 n=new Encapsulation1();
		n.getA();
		n.setA(1);
		System.out.println(" ");

		n.getB();
		n.setB("Shree");

	}

	

}
