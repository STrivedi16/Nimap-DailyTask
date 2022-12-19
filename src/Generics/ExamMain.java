package Generics;

public class ExamMain {

	public static void main(String[] args) {
		Example<Integer> obj=new Example<>();
		obj.add(15);
		System.out.println(obj.get());
		
		Example<String> es=new Example<>();
		es.add("This is String Value");
		System.out.println(es.get());
		

	}

}
