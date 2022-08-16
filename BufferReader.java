import java.io.*;
import java.lang.*;

class BufferReader
{
	public static void main(String args[]) throws Exception
	{
		InputStreamReader iobj = new InputStreamReader(System.in);
		BufferedReader bobj = new BufferedReader(iobj);
		
		System.out.println("Enter Your Name: ");
		String name = bobj.readLine();
		
		System.out.println("Hello, "+name);
		
	
	}
	
}