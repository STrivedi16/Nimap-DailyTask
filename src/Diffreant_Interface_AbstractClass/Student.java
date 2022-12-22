package Diffreant_Interface_AbstractClass;

public interface Student {
	
	public void info();
	
	/*default void sum()
	{
		int a=10;
		int b=20;
		
		System.out.println(a+b);
		
	}*/
}

// Interface Does not Allowed Body to Method . 
// Abstract Allowed Body .

/*
	-We can not give Body in Interface . Because Interface Only Allowed Abstract Method.
	-In Abstract Class we can Give Body, Because Abstract class Support Both Abstract Method and Non Abstract Method. 
	-Interface Support Multiple Inheritance 
	(Because we can implements more then one class)
	-Abstract Class Does not Support multiple inheritance
	(Because we Only Extends One Class);
*/