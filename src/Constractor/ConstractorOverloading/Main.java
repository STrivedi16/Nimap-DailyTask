package Constractor.ConstractorOverloading;

public class Main {

	public static void main(String[] args) {
	Passenger obj=new Passenger("Shubham");
	Passenger obj1=new Passenger("Mumbai", "London");
	Passenger obj2=new Passenger(25750);
	obj.details();
	}

}
