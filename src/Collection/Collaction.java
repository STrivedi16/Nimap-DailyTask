package Collection;

import java.util.ArrayList;

public class Collaction {

	
	ArrayList<Integer> al=new ArrayList<>();
	public void lst()
	{
		for(int i=1;i<=10;i++)
		{
			al.add(i);
			
		}
		System.out.println(al);
		
		System.out.println(al.contains(5));
		al.add(2, 100);
		System.out.println("After Add number at 2 Indexs"+al);
		System.out.println("Size of Arraylist="+al.size());
		
		al.remove(6);
		System.out.println(al);
		
		System.out.println(al.isEmpty());
		
	}
	
}

// Collections is a class so it has some method like contains , is empty , add , remove

