package Generics;

public class generics <T>{
		T add;
		public void sum(T add)
		{
			this.add=add;
		}
		
		public T get()
		{
			return add;
			
		}
		Integer a[]= {1,2,3,4,5};
		String b[]= {"Rajkot","Mumbai","Los Angelis ","London","New York"};
		Character c[]= {'a','b','c','d','f'};
		
		public static <X> void show(X[]  g)
		{
			for(X sho : g)
			{
				System.out.println(sho);
			}
		}
}
