package MultiThreading;

public class Main {

	public static void main(String[] args) {
		Thread t1=new Thread(new Example());
		t1.start();
		Thread t2=new Thread(new Charecter());
		t2.start();

	}

}


// SO Runnable Interface is Interface So We Can not make an object of Class .
// So We have to use thread for Execute Rannable Interface.
