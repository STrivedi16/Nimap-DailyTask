package polymorphism.Compile_Time;

public class Airline {
		int num;
		String dest, todest,type;
		
	public void Info(int numberofflight)
	{
			this.num=numberofflight;
	}
	public void Info(String destination , String toDestination)
	{
			this.dest=destination;
			this.todest=toDestination;
	}
	public void  Info(String Type)
	{
		this.type=Type;
	}
	
	
	public void show()
	{
		System.out.println("Flight Number="+num);
		System.out.println("From city "+dest+" To City "+todest);
		System.out.println("Flight type="+type);
	}
}



//Compile Time Polymorphism means Method Overloading  
// Method Overloading - One class have more then one method with a same name but different parameter 


