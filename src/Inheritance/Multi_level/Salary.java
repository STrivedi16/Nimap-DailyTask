package Inheritance.Multi_level;

public class Salary extends Employee
{
	float sal=0, as=0;
	
	public void Calculate()
	{
		sal=super.sl;
		as=sal*12;
	}
}
