final class finall {
    final int r=100;
    void fun()
    {
        System.out.println("R="+r);
    }
}
class p10 extends finall
{
    int k=500;
    void fun()
    {
        k=200;
        System.err.println("k="+k);
    }
    public static void main(String[] args) {
        p10 f1=new p10();
        f1.fun();
    }
}