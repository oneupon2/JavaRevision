import java.lang.*;
import java.util.*;


class Base extends Exception
{
	public Base(String str)
	{
		System.out.println(str);
	}
}

class UserDefinedException
{
	public static void main(String args[])
	{
		int age = 15;
		System.out.println("Inside Main>>");
		
		try
		{
			if(age < 18)
			{
				throw new Base("Age is less than 18");
			}
		}
		catch(Exception eobj)
		{
			System.out.println(eobj);
		}
	}
}