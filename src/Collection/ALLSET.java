package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class ALLSET {
	
	
	LinkedList<Integer> li=new LinkedList<>(); 
	public void num()
	{
		
		
		li.add(5);
		li.add(3);
		li.add(2);
		li.add(1);
		li.add(5);
		li.add(4);
		li.add(2);
		li.add(4);
		LinkedHashSet<Integer> s=new  LinkedHashSet<>(li);
		System.out.println(li);
		
		System.out.println("--------");
		System.out.println("BY LINKEDHASH SET");
		System.out.println(s);
		
		System.out.println("-----------");
		
		
		System.out.println("BY HASHSET");
		
		HashSet <String>hs=new HashSet<>();
		hs.add("Mumabai");
		hs.add("Rakot");
		hs.add("Dubai");
		hs.add("Sanfransisco");
		System.out.println(hs);
		
		
		
		
System.out.println("-----------");
		
		
		System.out.println("BY TREESET");
		
		TreeSet<Integer> ts=new TreeSet<>(li);
		System.out.println(ts);
		
		
		
	}
	
	
}


/*
 * SET is also used in collection 
 * SET Does not allowed Duplicate elements .
 * there are Three set LinkedHash , Hash , Tree.
 * linkedHash - Order Of Insert is same as inserting order.
 * Hash - Order of Insert is Random. 
 * Tree- Order of insert is in Asending Order
 */
