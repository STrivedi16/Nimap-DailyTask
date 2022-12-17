package Generics;

import java.util.ArrayList;

public class Reasion {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		
		al.add("Shubham");
		al.add(1);
		
		int a=(int) al.get(1); //  In this If We Can Not Do Casting Then It will Show Compile time error.
		
		String str=(String) al.get(0);
		
		System.out.println(al.get(0));
		
		
		ArrayList<String> al1=new ArrayList<>();
		
		// This List Will only Store String Value
		
		ArrayList<Integer> al2=new ArrayList<>();
		// This list only Store integer value
		
		
		// Type Perameter in Generic cannot be Primitive data Type
		
		
	}

}
