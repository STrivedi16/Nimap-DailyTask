package Inheritance.Multi_level;

public class Main {

	public static void main(String[] args) {
		TAX obj=new TAX();
		obj.details();
		obj.Calculate();
		
		System.out.println("Employee Name"+obj.nm);
		System.out.println("Employee Salary Annual "+obj.as);
		obj.caltax();
		System.out.println("Salary Tax "+obj.atx);

	}

}
