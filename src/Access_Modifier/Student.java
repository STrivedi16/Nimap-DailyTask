package Access_Modifier;

public class Student {

	public void information()
	{
		System.out.println("Public Mehtod Is Accessible to All ");
	}
	
	private void details()
	{
		System.out.println("Private method is Accessible  Within the class ");
	}
	
	void basicinfo()
	{
			System.out.println("Default Method is Accessible  Within the class or Within the packge ");
	}
	
	protected void info()
	{
		System.out.println("Protected Method is Accessible Within the class , Within the package  outside package by SubClass  ");
	}
}



// Public Method Is Access To All (WITHIN CLASS, WITHIN PACKAGE ,OUTSIDE PACKAGE BY SUB CLASSES, OUTSIDE)
