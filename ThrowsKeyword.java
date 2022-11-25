/*	User defined exception or custom exception
 * 	Exception class for checked exception	
 * 	RuntimeException class for unchecked exception
 * 	throws keyword only used with checked Exception 	
 */

package exceptionHandling;
import java.io.*;

class ReadAndWrite	{
	
	void readFile() throws FileNotFoundException
	{
		FileInputStream fis = new FileInputStream("f:/abc.txt");
		System.out.println(fis);
	}
	
	void saveFile() throws FileNotFoundException
	{
		FileOutputStream fos = new FileOutputStream("f:/xyz.txt");
		System.out.println(fos);
	}
}

public class ThrowsKeyword {
	
	public static void main(String[] args) {

		ReadAndWrite rw = new ReadAndWrite();
		
		try 
		{
			rw.readFile();
			System.out.println("Executed successfully");
		}
		
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		try 
		{
			rw.saveFile();
			System.out.println("Executed successfully");
		}
		
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}