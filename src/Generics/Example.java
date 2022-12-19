package Generics;

public class Example <T>{
	T ref;
	
		public  void add( T ref)
		{
			this.ref=ref;
		}
		
		public T get()
		{
			return ref;
			
		}

}
