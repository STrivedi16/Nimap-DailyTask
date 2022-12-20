package Generics;

public class GenericsMain {

	public static void main(String[] args) {
		generics<Integer> gi=new generics<>();
		gi.sum(25);
		System.out.println(gi.get());

		gi.show(gi.a);
		
		generics<String> gs=new generics<>();
		gs.sum("Hi");
		System.out.println(gs.get());
		gs.show(gs.b);
		
	}

}
