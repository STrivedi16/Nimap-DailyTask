package Lemda_Expressoin;



interface Sayable
{
	String say(String message);
}

/*
 * class Message implements Sayable
 * {
 * 		We have to make a class to Implements the interface 
 * 		To reduce this We Use Lembda Expreesion
 * 	
 * }
 */
public class Exampl1 {

	public static void main(String[] args) {
		Sayable person=(Message)->{
			String str="Hellow";
			String str1=str+" "+Message;
			return str1;
		};
		System.out.println(person.say("World"));

	}

}
