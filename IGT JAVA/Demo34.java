class A
{
	void abc() throws InvalidAgeException 
	{
		for(int age=1;age<=25;age++)
		{
			if(age==18) throw new InvalidAgeException("Please Check age Once again...!");
			System.out.println("AGE :"+age);
		}
	}
}
class Demo34
{
	public static void main(String args[]) 
	{
		try
		{
			A a = new A();
			a.abc();
		}
		catch(InvalidAgeException iae)
		{
			System.out.println(iae);
		}
	}
}
class InvalidAgeException extends Exception
{
	InvalidAgeException(String msg)
	{
	super(msg);
	}
}