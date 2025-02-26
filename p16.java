class Animal
{
    void eat()
    {
        System.out.println("I can eat");
    }
}
class Dog extends Animal
{
    void bark()
    {
        System.out.println("I can bark...");
    }
}
class Cat extends Animal
{
    void meow()
    {
        System.out.println("I can meow...");
    }
}
public class p16 {
    public static void main(String[] args) {
    Dog d1=new Dog();
    d1.eat();
    d1.bark();

    Cat c1=new Cat();
    c1.eat();
    c1.meow();
    }
}
