//final class Car 

class Car
{
final int speed=200;
//100 var
//100 method
final void run()
{
System.out.println("HI runnethod with speed of 200");
}
}
class Maruthi extends Car
{
	//void run()
	//{System.out.println("Hi rummethod with speed of 250)// final method cannt be overriden
	//}
}
class Demo25
{
	public static void main(String args[])
	{
		Car c=new Car();
		c.run();
		System.out.println("Speed: "+c.speed);
		//c.speed-2000:// we cant modify the final variable 
		System.out.println("Speed:"+c.speed);
		Maruthi m = new Maruthi();
		m.run();
	}
}