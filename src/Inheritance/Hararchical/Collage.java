package Inheritance.Hararchical;
import  java.util.*;
public class Collage 
{
	
	Scanner obj=new Scanner (System.in);
	Scanner ob=new Scanner (System.in);
	String nm,ci,em;
	long mob;
		public void Details()
		{
			System.out.println("Enter Name:");
			 nm=obj.nextLine();
			System.out.println("Enter Moblie number");
			 mob=obj.nextLong();
			System.out.println("Enter City");
			 ci=ob.nextLine();
			System.out.println("Enter Email id ");
			 em=ob.nextLine();
		}
		
		
		
}








// Hararchical Inheritance means Multiple Sub  class and only one Super class 
// Multiple Subclass Is derived form only one Superclass.