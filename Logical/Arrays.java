package Logical;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Arrays {

	public static void main(String[] args) {

		
		int a[] = new int[4];
		a[0] = 3;
		a[1] = 10;                           //<================
		a[2] = 11;
		a[3] = 2;

		for (int j = a.length - 1; j >= 0; j--) {
			System.out.print(" " + a[j] + " ");
		}
		System.out.println();
		
		/////////////////////////////////////////////////////////
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("balaji");
		list1.add("biradar");
		list1.add("latur");                       //Common Element:[balaji, biradar]


		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("balaji");
		list2.add("biradar");
		list2.add("udgir");


		list1.retainAll(list2);
		System.out.println();
		System.out.println("Common Element:" + list1);
		//////////////////////////////////////////////////////
		System.out.println();

		String name = "Pooja";
		Set<Character> uniqchae = new HashSet<>();
		char arr[] = name.toCharArray();         
	                           
		for (char c : arr) {         //Automation Testing:[ , A, a, e, g, i, m, n, o, s, t, T, u]
			uniqchae.add(c);
		}
		System.out.print(name + ":" + uniqchae);
		System.out.println();
		//////////////////////////////////////////////
		System.out.println();
		String name1 = "Pooja";                             //The string is :Pooja                                                 //The duplicate character of above String is:o 
		char arra[] = name1.toCharArray();                 //Duplicate is : o
		System.out.print("Duplicate character:");
		for (int i1 = 1; i1 < name1.length(); i1++) {
			for (int j1 = i1 + 1; j1 < name1.length(); j1++) {
				if (arra[i1] == arra[j1]) {
					System.out.print(arra[j1] + " ");
					break;
				}}
	}
		//////////////////////////////////////////////////////////////
		System.out.println();
		int temp = 0;
		int size;
		int array[] = { 221, 22, 44, 55, 65, 76, 87, 98, 123 };
		size = array.length;

		for (int i1 = 0; i1 < size; i1++) {
			for (int j1 = i1 + 1; j1 < size; j1++) {

				if (array[i1] > array[j1]) {
					temp = array[i1];
					array[i1] = array[j1];
					array[j1] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("Third second largest number is:: " + array[size - 3]);
	}
}
