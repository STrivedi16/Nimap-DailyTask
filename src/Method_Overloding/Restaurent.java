package Method_Overloding;

public class Restaurent {
	String list;
	int price;
	public void Menu(String List)
	{
		this.list=List;
	}
	public int Menu(int Price)
	{
		return this.price=Price;
	}
	
	public void Menu()
	{
		System.out.println(list+" "+price);
	}
	
	
	// Here in this programe There are Three Method Called Manu but Perameter of that metthos is different
	// one Method is for String Value like It show only item (Food Dish) second Method is for int value like it show price of Item (food dish),
	// Third Methos is for Show Both With All Manu .

}
