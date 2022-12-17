package Generics;

public class Method {

	public static void main(String[] args) {
		
		Integer iray[]= {1,2,3,4,5};
		Character cray[]= {'a','b','c','d','e'};
		
		show(iray);
		show(cray);
	}

	// Generic Method
	public static <T> void show(T[] x)
	{
		for(T S : x)
		{
			System.out.print(S+" ");
		}
		System.out.println();
	}
	
}
