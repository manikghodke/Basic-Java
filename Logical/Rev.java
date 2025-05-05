package Logical;

public class Rev {

	public static void main(String[] args) {
		String s = "Java";
		int a = s.length();                              //avaJ
		for (int i = a - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		System.out.println();

		
	//////////////////////////////////////////////////////////	
		int rem2, rev2 = 0;
		int n2 = 1234;

		while (n2 > 0) {

			rem2 = n2 % 10;
			n2 = n2 / 10;
			rev2 = (rev2 * 10) + rem2;

		}
		System.out.println(rev2);
		System.out.println();

		
		////////////////////////////////////////////////////////////////
		String[] k = "My country name is India".split(" ");
		StringBuilder revb = new StringBuilder();
		for (int j = k.length - 1; j >= 0; j--) {
			revb.append(k[j]);                  
			                               //India is name country My 
			revb.append(" ");                           //  <====
		}
		System.out.println("Reverse Word: "+ revb);

		System.out.println();
		////////////////////////////////////////////////////////////////////

		String j = "My name is Balaji";
		j = j.replace(" ", "");            //MynameisBalaji
		System.out.println("Space Remove: "+j);
		
		//////////////////////////////////////////////////////////////////////
		System.out.println();
		// Get the String
		String str = "Balaji";

		// Get the index
		int index = 5;                 // In Balaji index 5 is i

		// Get the specific character
		char ch = getCharFromString(str, index);

		System.out.println("Index " + str +" " + index + " is " + ch);

	}

	public static char getCharFromString(String str, int index) {
		return (char) str.codePointAt(index);
	}

}
