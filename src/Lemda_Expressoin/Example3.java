package Lemda_Expressoin;

	interface City{
		public String name(String city);
	}

public class Example3 {

	public static void main(String[] args) {
		City ci=(name)->{
			return name;
		};
		System.out.println(ci.name("Rajkot"));

	}

}
