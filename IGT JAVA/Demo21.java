class A
{
    int a;//0
    A(){}
}
class A1{}
//class A2 extends A1,A{}
abstract class B
{
    int a;// 0
   void abc(){}
}
interface I
{
    //int a;
    //I(){}
    void abc();
}
interface J{}
interface K extends J,I{}
class Main1
{
    public static void main(String args[])
    {           
        //I i = new I();no    
    }
}