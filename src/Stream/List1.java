package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class List1 {

	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(5,3,4,2,1);
		for(Integer a :li)
		{
			System.out.println(a);
		}
		
		Stream<Integer> st=li.stream();
		
		

	//	long cont= st.count();	
		//System.out.println("Total Elements="+cont);
		
		/*Stream<Integer> sort= st.sorted();
		System.out.println("Sorted data");
		sort.forEach(n -> System.out.print(n+" "));
		System.out.println();
		*/
			/*System.out.println("Mapping--------");
			
			Stream<Integer> map=st.map(n -> (n*2));
			map.forEach(c -> System.out.println(c));
	*/
		
		
	/*	System.out.println(" Fillter----");
		
		Stream<Integer> stre=st.filter(n -> n%2==0);
			stre.forEach(v-> System.out.println(v));
		*/
		
		System.out.println(" All Opration Filter , Map, Sorting");
		
		st.filter(n -> n%2==0).map(n -> (n*2)).sorted().forEach(n -> System.out.print(n+" "));;
			
		
	}

}
