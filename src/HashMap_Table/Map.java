package HashMap_Table;

import java.util.HashMap;

public class Map {

	public static void main(String[] args) {
		HashMap<String ,String> obj=new HashMap<>();
		obj.put("Shubham", "Rajkot");
		obj.put("Nisha", "Jamnagar");
		
		
		// Map Is Used For Mapping Key to Value;
		// Here i Take Both String ,
		// Key is for name , // Value is for city
		System.out.println(obj);
		
		HashMap<String , Integer> mp=new HashMap<>();
		mp.put("ABC", 25);
		mp.put("XYZ", 20);
		System.out.println(mp);
		
		System.out.println(mp.containsKey("ABC"));

	}

}
