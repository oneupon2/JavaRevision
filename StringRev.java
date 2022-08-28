//string reversal
import java.lang.*;
import java.util.*;
import java.io.*;


class Base
{
	String string;
	Base()
	{
		System.out.println("Inside Default Constructor");
		string = null;
	}
	
	public void revString(String string)
	{
		for(int i = 0; i<=string.length(); i++)
		{
			System.out.println(""+i);
		}
	}
}

class StringRev
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter string for reversal: ");
		
		String s1 = sobj.nextLine();
		
		sobj.close();
		
		Base bobj = new Base();
		bobj.revString(s1);
	}
}