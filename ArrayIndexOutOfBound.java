// This program will throw java.lang.ArrayIndexOutOfBoundsException exception

package exceptionHandling;
import java.io.IOException;

public class ArrayIndexOutOfBound {

	public static void main(String[] args) throws IOException {

		System.out.print("Enter an int element : ");
		int a = System.in.read();
		int[] arr = {1,2,3,4,5};
//		System.out.println(a[5]);
		
		try {
			System.out.println("Entered element is "+a);		
			System.out.println("Entered element is "+arr[6]);		
		} catch( ArrayIndexOutOfBoundsException e){ 
			System.out.println("Exception occured");
			System.out.println(e.getLocalizedMessage());			
		}
	}

}
