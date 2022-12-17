package Generics;

public class Main {

	public static void main(String[] args) {
		MyClass<Integer> obj=new MyClass<>();
		obj.add(55);
		MyClass<String> ob=new MyClass<>();
		ob.add("Hello World");
		
		System.out.println(obj.get());
		System.out.println(ob.get());

	}

}
