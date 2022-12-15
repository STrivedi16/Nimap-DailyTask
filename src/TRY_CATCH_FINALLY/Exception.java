package TRY_CATCH_FINALLY;

public class Exception 
{
	int a,b,c;
		public void calculate()
		{	
			a=10;
			b=0;
			try
			{
				c=a/b;
				// Here i have doing division 
				// i divide 10 by 0 so it will throw Runtime Exception 
				// so This Exception is Arithmetic Exception so output will show only catchblock 
			}
			catch(ArithmeticException ae)
			{
				System.out.println("Can not divide by Zero");
			}
			
		}
}




// Try catch is used to handle an exception , which is  at Runtime.
// If the exception is there then try block throw the Exception 
// Catch block catch the exception which is throwed by try Block 