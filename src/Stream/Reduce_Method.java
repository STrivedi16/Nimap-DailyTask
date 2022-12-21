package Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Reduce_Method {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		for(int i=1;i<=5;i++)
		{
			al.add(i);
		}
		System.out.println(al);
		
		Stream<Integer> st=al.stream();
		int result=st.reduce(0, (a,b)-> (a+b));
		
		// Here Identity Is 0 so It will start from 0 
		// In First process a=0 and b= first member of list;
		// Then it will add number 
		// After sum now a= Sum and b= next Member
		// That process will continue till list get over.
		
		// Suppose That I Change Identity  , and i take 5 .
		// So In That case a=5 b=first member of list
		System.out.println(result);
		
		
		// here i take reduce Method of Stream  , It used to reduce number and Convert into one number;

		// for That i take a list of 1 to 5 and then i am Doing a sum of that list  ,and Converted into One number
		
	}

}
