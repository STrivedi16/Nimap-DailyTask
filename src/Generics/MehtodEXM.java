package Generics;

public class MehtodEXM {

	static Integer a[]= {1,2,3,4,5};
	static Character ch[]= {'A','B','C','D','E'};
	static String st[]= {"Mumbai","Dubai","Rajkot","Los Angelis","San Francisco"};
	
	
	public static void main(String args[])
	{
		show(a);
		show(ch);
		show(st);
		
		
	}
	
	public static <T>  void show(T[] x)
	{
		for(T s : x)
		{
			System.out.print(s+" ");
		}
		System.out.println();
	}
}
