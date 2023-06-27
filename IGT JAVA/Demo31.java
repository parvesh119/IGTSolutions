interface University
{
	void exam();
	void result();
}
class IITA implements University
{
	public void exam()
	{
		System.out.println("Online");
	}
	 public void result()
	{
		System.out.println("Passed");
	}
}
class IITB implements University
{
	 public void exam()
	{
		//online
	}
	public void result()
	{
		//mail
	}
}
class IITC implements University
{	 public void exam()
	{
		//online
	}
	public void result()
	{
		//mail
	}
}
class Demo31
{
	public static void main(String args[])
	{
		IITA a= new IITA();
		a.result();
		a.exam();
	}
}
