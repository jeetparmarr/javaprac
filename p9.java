public class p9 {
    static int x;
    //int y=0;
    p9()
    {
        x++;
    }
    void display()
    {
        System.out.println("x="+x);
    }
    static void show()
    {
        System.out.println("static method x="+x);
    }
    static{
        System.out.println("This is a static block");
    }
    public static void main(String[] args) {
        p9 s1=new p9();
        s1.display();

        p9 s2=new p9();
        s2.display();

        p9 s3=new p9();
        s3.display();

        p9.show();
    }
    
}
