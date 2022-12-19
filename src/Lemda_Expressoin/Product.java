package Lemda_Expressoin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class prodtinfo{
	String name;
	int id;
	int price;
	public prodtinfo(int id, String name, int price)
	{
		super();
		this.id=id;
		this.name=name;
		this.price=price;
	}
	
}
public class Product {

	public static void main(String[] args) {
		List<prodtinfo> al=new ArrayList<>();
		al.add(new prodtinfo(1,"Iphone", 58000));
		al.add(new prodtinfo(3, "MackBook", 98000));
		al.add(new prodtinfo(2, "Iwatch", 25900));
		
		
		Collections.sort(al,(p1,p2)->{
			return p1.name.compareTo(p2.name);
		});
		
		for(prodtinfo p : al)
		{
			System.out.println(p);
		}
		
	}

}
