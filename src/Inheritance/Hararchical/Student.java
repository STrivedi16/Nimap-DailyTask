package Inheritance.Hararchical;
import java.util.*;
public class Student extends Collage
{
	int roll,M1,M2,M3;
		public void Student()
		{
			Scanner obj=new Scanner(System.in);
			System.out.println("Enter Student RollNo");
			roll=obj.nextInt();
			System.out.println("Enter a Marks of Subject one");
			M1=obj.nextInt();
			System.out.println("Enter a Marks of Subject Two");
			M2=obj.nextInt();
			System.out.println("Enter a Marks of Subject Three");
			M3=obj.nextInt();
			
					
		
		}
		
		public void Percentage()
		{
			float tm=M1+M2+M3;
			float p=(tm/300)*100;
			System.out.println("Total Marks of Student="+tm);
			System.out.println("Percentage="+p);
		}
		
		public void Show()
		{
			System.out.println("Name="+super.nm);
			System.out.println("City="+super.ci);
			System.out.println("Moblie Number="+super.mob);
			System.out.println("Email="+super.em);
			System.out.println("Roll Number ="+roll);
			System.out.println("Marks Of Subject One ="+M1);
			System.out.println("Marks Of Subject Two ="+M2);
			System.out.println("Marks Of Subject Three ="+M3);
		}
		
		
		
}
