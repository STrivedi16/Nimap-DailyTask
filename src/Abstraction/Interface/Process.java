package Abstraction.Interface;
import java.util.*;
public class Process  implements User,ATM
{
	
	int balance=15200;
Scanner obj=new Scanner(System.in);

@Override
public void userinfo() {
	System.out.println("Enter a Name:");
	String nm=obj.next();
	
	
}
	@Override
	public void withdraw() {
		
		System.out.println("Enter a Amount :");
		int w=obj.nextInt();
		
		int totlbal;
		if(balance>w)
		{
			totlbal=balance-w;
			System.out.println("Your Total Balnce="+totlbal);
		}
			
	}

	@Override
	public void Diposite() {
		System.out.println("Enter a Amount :");
		int d=obj.nextInt();
		
		int totlbal;
		
			totlbal=balance+d;
			System.out.println("Your Total Balnce="+totlbal);
				
		
	}

	

	

}
