final  class finall {
    final int r=100;
    final void fun()
    {
        System.out.println("R="+r);
    }
}
class p21
{
    public static void main(String[] args) {
        finall f1=new finall();
        f1.fun();
    }
}