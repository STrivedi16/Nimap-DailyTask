package Primitive_Refrence;

public class primitive {

	public static void main(String[] args) {
		byte a=15;
		short b=(short) (30*a);
		int c=b;
		long d=c;			// here i have done type casting 
		float e=d;
		double f=e;
		System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f);
		
		char ch='a';
		System.out.println(ch);
		int chr=(int)ch;				// here i have done casting 
		System.out.println(chr);
		
		boolean bool=false;
		System.out.println(bool);
		
		

	}

}




// primitive are data type  there are 8 primitive data type
/*
 *	byte, short , int , long , float , double ,char , boolean;
 * 
 * 
*/