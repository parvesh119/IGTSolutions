interface I
{
	public static final int a=10;
	public abstract void add();
	public abstract void sub();
}
interface J
{
	public static final int b=20;
	public abstract void mul();
	public abstract void div();
}
interface K extends I,J
{

}
class Cal implements K
{
	public void sub()
	{
		System.out.println(I.a-J.b);
	}
	public void add()
	{
		System.out.println(I.a+J.b);
	}
	public void mul()
	{
		System.out.println(I.a*J.b);
	}
	public void div()
	{
		System.out.println(I.a/J.b);
	}
}
class Demo27
{
	public static void main(String args[])
	{
		System.out.println("========CAL=========");
		Cal c=new Cal();
		c.add();
		c.sub();
		c.div();
		c.mul();	
			System.out.println("========I Interface=========");
		I i=c;
		i.add();
		i.sub();
		//c.div();
		//c.mul();	
			System.out.println("========J Interface=========");
		J j=c;
		//j.add();
		//j.sub();
		j.div();
		j.mul();	
			System.out.println("========K Interface=========");
		K k=c;
		k.add();
		k.sub();
		k.div();
		k.mul();	
	}
}