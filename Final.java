class Base 
{
	final public int i;
	int j = 22;
	//i = 21;
	
	Base()
	{
		this.i = 11;
		System.out.println("Inside Default Constructor>>"+i);
		
	}
	public void fun()
	{
		System.out.println("Inside Fun>>");
		
	}
	
	final void gun()
	{
		System.out.println("Inside Gun>>");
	}
	
}

class Derived extends Base
{
	public void fun()
	{
		System.out.println("Inside Derived Fun>>"+super.j);
	}
	
/* 	void gun()
	{
		System.out.println("Inside Derived Gun>>");
	} */
}

class Final
{
	public static void main(String args[])
	{
		
		Derived dobj =  new Derived();
		dobj.fun();
		
		Base bobj =  new Base();
		bobj.fun();
	}
}