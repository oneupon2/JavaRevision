import java.util.*;
import java.lang.*;
import java.io.*;

class Base extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("Thread In Fun"+Thread.currentThread().getId());
		}
		catch(Exception eobj)
		{
			
		}
	}
}

class Threading
{
	public static void main(String args[])
	{
		Base bobj1 =  new Base();
		Thread t1 =  new Thread(bobj1);
		
		Base bobj2 =  new Base();
		Thread t2 =  new Thread(bobj2);
		
		t1.start();
		t2.start();
	
	}
}
