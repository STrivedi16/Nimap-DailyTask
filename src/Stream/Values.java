package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Values {

	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(5,2,1,3,4);
		List<Integer> re=li.stream().sorted().collect(Collectors.toList());
		
		System.out.println(re);
		
		
		
		// Stream is sequence of Object that Support various method which can be pipelined to Produce the desire result
		
		
		
		
	}

}
