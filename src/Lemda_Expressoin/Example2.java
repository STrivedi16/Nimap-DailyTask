package Lemda_Expressoin;

	interface Information{
		public void info(String name, String city);
	}


public class Example2 {

	public static void main(String[] args) {
		String nm="Shubham";
		String ci="Rajkot";
		
		Information io=(name,city)->{
			System.out.println("Name="+nm);
			System.out.println("City="+ci);
		};
	io.info(nm, ci);
		

	}
	
	 

}


// Lembda Expression in used in java 8
// It Is very UseFull in Collection library.

// it used to provide the implementation of functional interface;
// Less Coding Required