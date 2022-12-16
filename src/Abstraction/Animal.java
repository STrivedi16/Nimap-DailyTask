package Abstraction;

public abstract class Animal 
{
	String an,sd;
	public void Sound(String animal, String sound)
	{
		this.an=animal;					// Here i am Using Abstract class 
										// In Abstract class there is Abstract method and non abstract method 
		this.sd=sound;					// here Sound is Non Abstract Method and food is abstract Method
	}
	public abstract void food(String food);
}



// Abstraction is process to hide Some unused data from User .
// abstraction is the process to hide Implementation from user.

// Abstraction can achieve by  Abstract Class , and interface.

