//fibonacci series

//a b 
//0 1 1 2 3 5 8
import java.lang.*;
import java.util.*;
import java.io.*;


class Base
{
	int iNo1;
	
	Base()
	{
		System.out.println("Inside Default Constructor");
		iNo1 = 0;
	}
	
	public void getFibonnaci(int iNo1)
	{	
		int a = 0;
		int b = 1;
		int fibonacci = 0;
		
		for(int i = 0; i<=iNo1; i++)
		{
			fibonacci = a + b;
			a = b;
			b = fibonacci;
			System.out.print(">>"+fibonacci);	
	
		}
	}
}


class Fibonacci
{
	public static void main(String args[])
	{
		Scanner sobj =  new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		int No1 = sobj.nextInt();
		
		sobj.close();
		
		Base bobj = new Base();
		bobj.getFibonnaci(No1);
		
	}
}