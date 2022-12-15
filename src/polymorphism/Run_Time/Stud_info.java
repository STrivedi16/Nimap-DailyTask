package polymorphism.Run_Time;
import java.util.*;
public class Stud_info extends Student
{
	Scanner sc=new Scanner(System.in);
	int m1,m2,m3;
	float tm,p;
		public void Marks()
		{
			System.out.println("Enter a Marks of Subject 1");
			 m1=obj.nextInt();
			 System.out.println("Enter a Marks of Subject 2");
			 m2=obj.nextInt();
			 System.out.println("Enter a Marks of Subject 3");
			 m3=obj.nextInt();
			 tm=m1+m2+m3;
			 p=(tm/300)*100;
		}
		public void show()
		{
			System.out.println("Name="+super.nm);
			System.out.println("City="+super.ci);
			System.out.println("Email="+super.em);
			System.out.println("Marks of m1="+m1);
			System.out.println("Marks of m2="+m2);
			System.out.println("Marks of m3="+m3);
			System.out.println("Total Marks="+tm);
			System.out.println("Percentage="+p);
		}
}



// Here Show Method is OverRide so Super class Show Mehtod is Override so It does not Show Output
