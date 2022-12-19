package Lemda_Expressoin;

@FunctionalInterface
interface info
{
	
	public void show();
}

class details implements info
{

	@Override
	public void show() {
		System.out.println("Hellow");
		
	}
	
}

public class Student {

	public static void main(String[] args) {
		
		info obj=new details();
		obj.show();
		
		
		/*
		info obj=() -> 	System.out.println("Hellow World");
		obj.show();
		*/
	}

}



// Lembda Expreesion used to provide implimentaion of interface
// Less Coding 


// Here interface info has Abstract Method for that method we have to make a implimation class and after that we can make an object and then execute it .
// To Reduce that part or Remove code or Make a Less Code Lembda Expresion is used.

