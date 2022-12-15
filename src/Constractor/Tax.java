package Constractor;

public class Tax 
{
	int bill;
	Tax(int bill)
	{
		this.bill=bill;
		
	}
	float totalbill;
	public void GST()
	{
		float cgst=0.09f;
		float txcalculate=bill*cgst;
		 totalbill=bill+txcalculate;
		
		
	}
	public void show()
	{
		System.out.println("Total Bill="+totalbill);
	}
	
	
	// Constractor is spcial type of method that is use to initialized the object .
	// Every Java class Has Constractor . 
	// Constractor is automatically when we create an object .
	
	
}
