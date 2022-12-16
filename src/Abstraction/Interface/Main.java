package Abstraction.Interface;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Process obj=new Process();
		obj.userinfo();
			Scanner sc=new Scanner(System.in);
			System.out.println("Please Select one Option");
			System.out.println("1-Withdraw");
			System.out.println("2-Diposite");
			String choies=sc.next();
			if(choies.endsWith("1")||choies.equals("w")||choies.equals("withdraw"))
			{
				obj.withdraw();
			}
			if(choies.endsWith("2")||choies.equals("d")||choies.equals("diposite"))
			{
				obj.Diposite();
			}
			

	}

}
