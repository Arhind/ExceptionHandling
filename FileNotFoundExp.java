// This program will throw java.lang.FileNotFoundException exception

package exceptionHandling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileNotFoundExp {

	public static void main(String[] args) {

		try
		{
			FileInputStream file = new FileInputStream("f:/abc.txt");
			System.out.println(file);
		}
		
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
	}
}