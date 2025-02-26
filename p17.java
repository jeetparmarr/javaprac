class Animal
{
    void eat()
    {
        System.out.println("I can eat");
    }
}
class p17 extends Animal
{
    void eat()
    {
        System.out.println("A dog is eating");
    }
    public static void main(String[] args) {
        p17 p=new p17();
        p.eat();
    }
}