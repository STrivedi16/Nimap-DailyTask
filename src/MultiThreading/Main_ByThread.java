package MultiThreading;

public class Main_ByThread {

	public static void main(String[] args) {
		ByThread t1=new ByThread();
		t1.start();
		Second t2=new Second();
		t2.start();

	}

}
