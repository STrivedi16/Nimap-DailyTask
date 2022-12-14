package Inheritance.Hararchical;
import java.util.*;
public class Professer extends Collage
{
	int id, salary;
	String sub;
	Scanner obj=new Scanner(System.in);
		public void professer()
		{
			System.out.println("Enter a Faculty id" );
			id=obj.nextInt();
			System.out.println("Enter a Salary ");
			salary=obj.nextInt();
			System.out.println("Enter Subject of Faculty");
			sub=obj.next();
		}
		
		public void Show()
		{
			System.out.println("Name="+super.nm);
			System.out.println("City="+super.ci);
			System.out.println("Moblie Number="+super.mob);
			System.out.println("Email="+super.em);
			System.out.println("Id="+id);
			System.out.println("Subject="+sub);
			System.out.println("salary="+salary);
			
		}
}
