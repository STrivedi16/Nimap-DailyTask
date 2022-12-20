package Constractor.ConstractorOverloading;

public class Passenger {
	int ticket;
	String name,city, tocity;
	 public Passenger(String name)
	{
		 	this.name=name;
		 	 System.out.println("Passenger Name="+name);
	}
	 
	 public Passenger(String city, String tocity)
		{
			 	this.city=city;
			 	this.tocity=tocity;
			 	 System.out.println("Passenger City-"+city);
				 System.out.println("Passenger To City-"+tocity);
		}
	 public Passenger(int ticket)
		{
			 	this.ticket=ticket;
				 System.out.println("Ticket Price="+ticket);
		}
	 
	 
	 public void details()
	 {
		System.out.println("AirLine- AirIndia ");
		

	 }
	 
	 // Constructor Overloading-: When We Have More Then one Constructor With a Different Parameter.
}
