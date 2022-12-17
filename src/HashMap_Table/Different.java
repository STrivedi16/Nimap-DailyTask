package HashMap_Table;

import java.util.HashMap;
import java.util.Hashtable;

public class Different {

	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<>();
		System.out.println("HashMap");
		
		hm.put(103, "Shubham");
		hm.put(102, "Ankit");
		hm.put(102, "Rocky");
		hm.put(101, "Saloni");
		hm.put(104, "Soniya");
		System.out.println(hm);
		
		System.out.println("--------");
		
		
		System.out.println("HashTable");
		
		Hashtable<Integer, String> ht=new Hashtable<>();
		
		ht.put(103, "Shubham");
		ht.put(102, "Ankit");
		ht.put(102, "Rocky");
		ht.put(101, "Saloni");
		ht.put(104, "Soniya");
		System.out.println(ht);
		
	}

}

// Hash Map Gives output in Forward Direction.
// Hash Table Give output in rivers Direction 
