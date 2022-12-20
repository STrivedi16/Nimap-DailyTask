package TRY_CATCH_FINALLY;

public class finally_Method {

	String  nm;
	public void show()
	{
		try
		{
		System.out.println(nm.isEmpty());
		
		// Here I Define String variable but not  declare .
		// I am checking that Variable is Empty or not , so it will throw Exception so catch block is excecute ;
		
		
		
		}
		catch (NullPointerException e) {
			System.out.println("Your have not declare String");
		}
		finally {
			System.out.println("Hellow World");
		}
		
		
		
		// Finally is a block that Compulsory execute while Execution   if Exception occur or not 
		
	}
}
