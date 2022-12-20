package Product_lembda_;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		
		Product obj=(name, price)->{
			System.out.println(name+" "+price);
		};
		obj.add("Drum", 25000);
	}

}
