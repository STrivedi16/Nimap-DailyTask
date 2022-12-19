package Lemda_Expressoin;
interface add{
	public void num();
}

public class Example {

	public static void main(String[] args) {
		int w=10;
		
		add a=()->{
			System.out.println("Number ="+w);
		};
		
	a.num();

	}

}
