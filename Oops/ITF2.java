package Oops;

class ITF2 implements ITF1 {

	public void sd24() {
		System.out.println("sd24");
	}

	public void sd25() {
		System.out.println("sd25");
	}

	public static void main(String[] args) {

		ITF2 f = new ITF2();
		f.sd24();
		f.sd25();

	}

}
