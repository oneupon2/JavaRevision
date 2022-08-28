import java.lang.*;
import java.util.*;

class ExceptionHandling
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);
		
		int arr[] = {10,20,30,40,50};
		
		System.out.println("Inside Main>>");
		
		System.out.println("Enter Index");
		int index = sobj.nextInt();
		
		sobj.close();
		
		try //Exception agar yha aya to catch me jayega
		{
			
			System.out.println("Inside Try Block>>");
			System.out.println("Element according to index: "+arr[index]);	
			
		}
		
		catch(ArrayIndexOutOfBoundsException obj)
		{
			System.out.println("Inside Catch Block>>");
		}
		
		finally
		{
			System.out.println("Inside Finally Block>>");
		}
		
		
		System.out.println("Khatam Tata Tata Bye Bye :)");
	
	}
}