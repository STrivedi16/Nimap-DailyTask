package MultiThreading;

class Second extends Thread
{
	 @Override
	public void run() {
		for(int i=67;i<75;i++)
		{
			System.out.print((char)i+" ");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ByThread extends Thread{
	@Override
	public void run() {
		for(int i=0;i<=10;i++)
		{
			System.out.print(i+" ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


/*
	-Thread is a class we extends the  class so we can Make an object of class 
	Different is that is In Thread Class We can not implements More Classes 
	In Runnable Interface We implements More Classes
*/