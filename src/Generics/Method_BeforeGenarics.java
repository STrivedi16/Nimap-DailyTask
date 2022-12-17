package Generics;

public class Method_BeforeGenarics {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		char b[]= {'a','b','c','d','e'};
		
		show(a);
		show(b);

	}

	private static void show(char[] b) {
		
		for(char x :b)
		{
			System.out.print(x+" ");
			
		}
		System.out.println();
		
	}

	public  static void show(int[] a) {
		for(int x :a)
		{
			System.out.print(x+" ");
			
		}
		System.out.println();
		
	}

}
