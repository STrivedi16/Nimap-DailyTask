package Generics;

public class Employee <T>{
		T Name,city;
		public void set(T name , T city)
		{
			this.Name=name;
			this.city=city;
		}
		public void get() {
			System.out.println(Name);
			System.out.println(city);
		}
		
		public static <X> void show(X a)
		{
			System.out.println(a);
		}
}
