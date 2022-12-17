package Collection.LIST;

import java.util.ArrayList;
import java.util.*;
public class General_arraylist {

	Scanner obj=new Scanner (System.in);
	
	ArrayList al=new ArrayList<>();
	public void lst()
	{
			System.out.println("Enter name:");
			String nm=obj.next();
			System.out.println("Enter City:");
			String ci=obj.next();
			System.out.println("Enter id");
			int id=obj.nextInt();
			
			al.add(nm);
			al.add(ci);
			al.add(id);
			
			System.out.println(al);
	}
}


// List Has Some Type like ArrayList , Linked List , Vector ,. 
// Which is Available In java.util package.

/*
		By Using Arraylist or Any Another List We can Store the Element in List Format
		Different Between the Arraylist and Linked List  
		- Arraylist has squantial Memory elemets are daireactly Connected  
		-Linked  List has Random Memory. elements are Connected by Link

*/