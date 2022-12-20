package Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Example {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(9);
		al.add(3);
		al.add(5);
		al.add(7);
		al.add(6);
		al.add(2);
		al.add(4);
		al.add(8);
		System.out.println(al);
		
		Stream<Integer> st=al.stream();
		
		
		//System.out.println("Sorted List");
		
	/*	Stream<Integer> nst=st.sorted();
		nst.forEach(n -> System.out.print(n+" "));
		System.out.println();
		*/
		/*System.out.println(" Map");
		
		Stream<Integer> str=st.map(n -> (n*2));
		str.forEach(a -> System.out.print(a+ " "));
		System.out.println();
		*/
		/*System.out.println("Filter");
		Stream<Integer> fil=st.filter(n -> (n%2==0));
		fil.forEach(a -> System.out.print(a+" "));
		*/
		
	/*	System.out.println("All Process Map, Sorting, Filter");
		st.sorted().map(n -> (n*2)).filter(n -> (n%2==0)).forEach(n -> System.out.print(n+" "));

/*		ArrayList li =new ArrayList<>();
		li.add("abc");
		li.add("Xyz");
		li.add("efg");
		li.add("klm");
		
		Stream stm=li.stream();
		stm.sorted().forEach(n -> System.out.print(n+" "));
		
*/		
		
		
		int result =  st.reduce(4, (a,b) -> (a+b));
		System.out.println(result);
	}

}
