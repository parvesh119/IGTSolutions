package P2;
import P1.A;

class D extends A
{
	void display()
	{
		System.out.println(a1);
		//System.out.println(b1); 
		System.out.println(c1);
		//System.out.println(d1);
	}
}
class E
{
	void display()
	{	
		A a= new A();
		System.out.println(a.a1);
		//System.out.println(b1); private only for 
		//System.out.println(a.c1);
		//System.out.println(a.d1);
	}
}
class F extends A
{
	void display()
	{
		System.out.println(a1);
		//System.out.println(b1); private only for 
		System.out.println(c1);
		//System.out.println(d1);
	}
}
