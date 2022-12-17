package MultiThreading;
class Charecter implements Runnable
{

	@Override
	public void run() {
		for(char i='a';i<='j';i++)
		{
			System.out.println(i);
		}
		
	}
	
}

public class Example implements Runnable
{

	@Override
	public void run() {
		for(int i=1;i<=10;i++)
		{
			try {
				Thread.sleep(2000);
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		
	}
	
	
	

}


// Multithreading  refers two or more task excuting concurrently within a single Program.
// we can do Multithreading in two ways by Thread Class or by Runnable Interface 

/*
 * In this Example I Used Runnable Interface 
 * In Runnable Interface there is Abstract Method that we Must have to Implement  
 * 
*/
