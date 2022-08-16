import java.lang.*;
import java.util.*;

class Array
{
		public static void main(String args[])
		{
			int arr[] = new int[5]; // arr bana int type ka = new usme 5bytes ka memory de
			System.out.println(arr.length);
			
			int brr[] = {1,"two",3,4,5,6};// jo values chahiye aise declare kardo
			for(int i=0; i<brr.length; i++){
				System.out.println("Brr Values: "+brr[i]);
			}
		}
	
}
