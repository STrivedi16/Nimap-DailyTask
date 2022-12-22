package HashMap_Table;

import java.util.HashMap;
import java.util.Hashtable;

public class Student {

	public static void main(String[] args) {
		
		HashMap<Integer, String> student=new HashMap<>();
		// Here i took Key as roll number integer
		// And Value as Student name String;
		student.put(1, "Akshay");
		student.put(2, "Soniya");
		
		System.out.println(student);
		System.out.println(student.containsKey(1));
		
		Hashtable<Integer, String> stud=new Hashtable<>();
		// Here i took Key as roll number integer
				// And Value as Student name String;
				stud.put(1, "Akshay");
				stud.put(2, "Soniya");
				System.out.println(stud);
		
	}

}

// Hash Table gives output in reveres direction
// Hash Map Gives output in Forward direction
