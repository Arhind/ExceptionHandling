//Methods to Print Exception Information in Java
// e.printStackTrace(); will print Exception name, Message, Line no in which exception occured
// System.out.println(e); or System.out.println(e.toString()); will print only Exception name and Message
// System.out.println(e.getMessage()); will print Message only

package exceptionHandling;

public class ExceptionMessageMethods {

	public static void main(String[] args) {
		try 
		{
			int a=100,b=0,c;
			c=a/b;
			System.out.println(c);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println();
			System.out.println(e);
			System.out.println();
			System.out.println(e.toString());
			System.out.println();
			System.out.println(e.getMessage());
		}
	}
}