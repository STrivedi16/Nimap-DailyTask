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
		System.out.println("This is Perent Class Method That is going to  Overridde");
	}
}



// Runtime Polymorphism means There are two class Super Class And Subclass  and they connected throw Inheritance
// so Without inheritance We Can not perform Runtime Polymorphism.
// Both class have same method (Name and parameter) then is called as Method overRidding
//in this Program there is Show Method that is Override.
