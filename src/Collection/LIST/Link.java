package Collection.LIST;

import java.util.Collections;
import java.util.LinkedList;

import Collection.Collaction;

public class Link {
	public void lst()
	{
		LinkedList  li =new LinkedList<>();
		li.add("Mumbai");
		li.add("Los Angelis ");
		li.add("New York");
		li.add("Rajkot");
		li.add("Dubai");
		
		System.out.println(li);
		
		
		System.out.println(li.contains("Rajkot"));
		
		Collections.sort(li);
		System.out.println("After Sorting");
		System.out.println(li);
		
		
		
		System.out.println(li.isEmpty());
		
		
	}
}
