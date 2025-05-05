package Oops;

public class RTP_OverRiding2 extends RTP_OverRiding1 {

	void draw() {
		System.out.println("d2");
	}

	public static void main(String[] args) {

		RTP_OverRiding1 h = new RTP_OverRiding2();
		h.draw();

	}

}
