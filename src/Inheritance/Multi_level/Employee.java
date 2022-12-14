package Inheritance.Multi_level;
import java.util.*;
public class Employee {
	float sl=0;
	String nm=null;
	public void details()
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a Name");
		nm=obj.next();
		System.out.println("Enter Monthly Salary");
		sl=obj.nextInt();
		
		
	}

	// in MultiLevel Inheritance Multiple Sub class are there and only one Super class .
	// in MultiLevel Inheritance Sub class is also perfome as superclass to another sub class .
}
