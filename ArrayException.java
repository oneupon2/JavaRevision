import java.lang.*;
import java.util.*;

class Demo
{
	public void Fun(int index) throws ArrayIndexOutOfBoundsException
	{
		System.out.println("Inside Function Fun:");
		int arr[] = {10,20,30,40,50,60};
		System.out.println("Array according to the given index :"+arr[index]);
		
	}
}

class ArrayException
{
	public static void main(String args[])
	{
		System.out.println("Inside Main: ");
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the Index No: ");
		int index = sobj.nextInt();
		
		try
		{
			Demo dobj = new Demo();
			dobj.Fun(index);
		}
		catch(ArrayIndexOutOfBoundsException aobj)
		{
			System.out.println("Inside Catch");
		}
		
		
	}
}