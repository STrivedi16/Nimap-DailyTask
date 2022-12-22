package Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Slicing {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
			for(int i=0;i<=10;i++)
			{
				al.add(i);
			}
			System.out.println(al);
			
			
			Stream<Integer> st=al.stream();
			int startindex= 5;
			int endindex= 10;
					
			st.skip(startindex).limit(endindex-startindex+1).forEach(n -> System.out.print(n+" "));
			
			
			//  Slicing is like slice like we can slice the elements 
			// To do Slicing we have to use skip and limit method;
			
			// As Show Above i took one List of 10 Number;
			/*
			 * in which i do  Slicing of number 5  to 10;
			 * so my starting index is 5 as show above startindex=5 and endindex =10
			 * 
			 * skip method is used to skip elements 
			 * limit is used for till limit 
			 * so Here in operation first print 5 then in limit (10-5)+1=6 print 
 			 * 5 ,6 ,7...
			 * 
			 */

	}

}
