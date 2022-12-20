package Lemda_Expressoin;

import java.util.ArrayList;

interface Music{
	public String instrument(String name);
	
	
}
public class Example4 {

	public static void main(String[] args) {
		Music mu=(name)->{
			return name;
		};
		System.out.println(mu.instrument("Drum"));
		
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.forEach(n -> System.out.println(n));
		
	}

}
