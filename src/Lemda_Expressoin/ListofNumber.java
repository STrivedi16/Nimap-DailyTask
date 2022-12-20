package Lemda_Expressoin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import javax.crypto.CipherInputStream;

public class ListofNumber {

	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(1,2,3,4,5);
		/*Consumer<Integer> con=new Consumer<Integer>() {
			
			@Override
			public void accept(Integer t) {
				System.out.println(t);
				
			}
		};
		li.forEach(con);
*/
	/*	for(int n : li)
		{
			System.out.println(n);
		}*/
		
		
		
		
		
		
		
		// Instead of that we can reduce the code 
		// if we have Only one stream then we don't Need Curly 
			// we don't need Large block of code
	
		li.forEach(n -> System.out.println(n));
	}

}
