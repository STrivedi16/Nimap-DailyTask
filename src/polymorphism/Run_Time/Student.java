package polymorphism.Run_Time;
import java.util.*;
class Student {
	Scanner obj=new Scanner(System.in);
	String nm,ci,em;
	
	public void info()
	{
		System.out.println("Enter Name:");
		nm=obj.next();
		System.out.println("Enter City:");
		ci=obj.next();
		System.out.println("Enter Email:");
		em=obj.next();
		
	}
	public void show()
	{
		System.out.println("This is Perent Class Method That is Overridde");
	}
}



// Runtime Poltmorphism means There are two class Super Class And Subclass  and they conected throw Inheritance
// so Without inheritance We Can not perform Runtime Polymorphism.
//in this Program there is Show Method that is Override.