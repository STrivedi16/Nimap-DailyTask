package Practies;

public class General_poly {

	int id, price , seatno;
	String name, city1 ,city2 ;
	
	public void ticket(int id, String name)
	{
		this.id=id;
		this.name=name;
		
		
		
	}
	 
	public void ticket(String city1, String city2, int seatnum, int price)
	{
		this.city1=city1;
		this.city2=city2;
		this.seatno=seatnum;
		this.price=price;
	}
	
}
