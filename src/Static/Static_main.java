package Static;

public class Static_main {

	public static void main(String[] args) {
		Static.a=15;
		Static.b=12;
		
		int c;
		c=Static.a+Static.b;
		System.out.println(c);
		
		Static obj=new Static();
		obj.calculate();
				
		
		

	}

}
