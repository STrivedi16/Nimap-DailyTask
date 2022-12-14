package Inheritance.Simple_inheritance;
import java.util.*;
public class Employee {
	
	String nm=null;
	int sl=0;
	Scanner obj=new Scanner(System.in);
	public void Details ()
	{
		
		System.out.println("Enter a name");
		nm=obj.next();
		System.out.println("Enter a Salary");
		 sl=obj.nextInt();
		
		
		
		
		
	}
	 

	// inheritance means one Mechanism Where new Class is derived from the another class 
	// here this Employee class is based class or Super class .
}
