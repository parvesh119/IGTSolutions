class A
{
	static int x=10;
	static void abc()
	{
		System.out.println("HI abc method");
	}
}


class Demo24
{
	public static void main(String args[])
	{
		A.abc();
		System.out.println("X:"+A.x);
	}
}
//static :it will not belonges to object
// without creating a object we can access