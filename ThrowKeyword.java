/*	User defined exception or custom exception
 * 	Exception class for checked exception	
 * 	RuntimeException class for unchecked exception
 * 	super keyword used to provide exception message to Default Exception Handler
 * 	throw keyword is used for checked and unchecked exception
 */

package exceptionHandling;

class ThrowException extends RuntimeException { 	//OR Exception
	
	ThrowException()
	{
		super("You are under age");
	}
	
	ThrowException(String msg)
	{
		super(msg);		//Super keyword used to provide exception message to Default Exception Handler
	}
}

public class ThrowKeyword {

	public static void main(String[] args) {

		int age = 2;
		
		try 
		{
			if(age<18)
			{
				throw new ThrowException("Not eligible for voting");
			}
			else
			{
				System.out.println("Eligible for voting");
			}
		}
		
		catch(ThrowException th)
		{
			System.out.println(th);
		}
	}
}