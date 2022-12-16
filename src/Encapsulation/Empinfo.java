package Encapsulation;

public class Empinfo {

	
	Employee emp=new Employee();
	public void set()
	{
		
		emp.setName("Shubham");
		emp.setEmail("abc@gamil.com");
		emp.setPassword("xyz123");
		emp.setSalalry(56000);
		
		
		
		
		
	}
	
	public void show()
	{
		System.out.println(emp.getName());
		System.out.println(emp.getEmail());
		System.out.println(emp.getPassword());
		System.out.println(emp.getSalalry());
	}
}
