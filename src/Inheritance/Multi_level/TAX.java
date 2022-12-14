package Inheritance.Multi_level;

public class TAX extends Salary
{
	float tx=0.05f;
	float atx;
	float asa, sal;
	
	public void caltax()
	{
		
		asa=super.as;
		
		atx=asa*tx;
	
		
	}
}
