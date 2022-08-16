import java.lang.*;
import java.util.Scanner;

class Arithematic
{
	int iNo1;
	int iNo2;

	
	Arithematic()	
	{
		System.out.println("Inside Default Constructor>>");
		iNo1 = 0;
		iNo2 = 0;
	}
	
 	Arithematic(int x, int y)
	{
			System.out.println("Inside Parameterized Constructor>>");
			this.iNo1 = x;
			this.iNo2 = y;
	}

	int Add()
	{
			return iNo1 + iNo2;
	}
}

public class Calculator{
	
	public static void main(String args[])
	{
			Scanner sobj = new Scanner(System.in);
			
			System.out.println("Enter First Number");
			int iNo1 = sobj.nextInt();
			
			
			System.out.println("Enter Second Number");
			int iNo2 = sobj.nextInt();
			
			Arithematic aobj = new Arithematic(iNo1,iNo2);
			
			int ret = aobj.Add();
			
			System.out.println("The addition of "+iNo1+" & "+iNo2+" is: "+ret);
	}
}