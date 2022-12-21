package Generics;

public class EmpMain {

	public static void main(String[] args) {
		Employee<String> obj=new Employee<>();
		obj.set("Shubam", "Rajkot");
		obj.get();
		obj.show("ABC");
	
		
		Employee<Integer> ob=new Employee<>();
		ob.set(12, 25);
		ob.get();
		
		

	}

}
