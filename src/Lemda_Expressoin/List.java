package Lemda_Expressoin;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		for(int i=1;i<=10;i++)
		{
			al.add(i);
		}
		
		System.out.println(al);
		System.out.println(" Without Lembda  Expressoin");
		
		for(Integer a : al)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.println("With Lembda EXpressoin");
		
		al.forEach((n)-> System.out.print(n+" "));
		
		al.add(15);
		System.out.println();
		
		al.forEach((n)-> System.out.print(n+" "));
			
		
		// Lembda Expressoin is we want to do less coding and get output
		
	}

}
