class A
{
    void eat()
    {
        System.out.println("I can eat");
    }
}
class p14 extends A
{
    void bark()
    {
        System.out.println("I can bark...");
    }
    public static void main(String[] args) {
        p14 s1=new p14();
        s1.eat();
        s1.bark();
    }
}