class A
{
    A()
    {
        System.out.println("I am superclass");
    }
}
class B extends A
{
    B()
    {
        super();
        System.out.println("I am super class of multilevel and subclass of A");
    }
}
public class p15 extends B 
{
    p15()
    {
        super();
        System.out.println("I am subclass of B");
    }
    public static void main(String[] args) {
        p15 m=new p15();
    }
}
