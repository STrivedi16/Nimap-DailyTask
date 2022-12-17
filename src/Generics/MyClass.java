package Generics;

public class MyClass<T> {
	private T ref;					// Variable

	public void add(T ref)
	{
		this.ref=ref;
		
	}

	public T get()
	{
		return ref;
	}
	
}
