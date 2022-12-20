package Inheritance.Multiple;

public class Details implements Student, Studproinfo
{

	@Override
	public void profinfo() {
		System.out.println("Marks of Subject one= 86");
		System.out.println("Marks of Subject Two= 79");
		System.out.println("Marks of Subject Three= 91");
		
	}

	@Override
	public void basicinfo() {
		System.out.println("Name- Shubham");
		System.out.println("City - Rajkot");
		System.out.println("Email - shubhammtrivedi@gmail.com");
		
	}

}
