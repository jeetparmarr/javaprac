interface sq
{
    public static int getsq(int x)
    {
        return x*x;
    }
}
interface qb
{
    public static int getqb(int x)
    {
        System.out.println(x);
        return x*x*x;
    }
}
interface sqr
{
    public static double getsqr(int x)
    {
        return (Math.sqrt(x));
    }
}
public class p19 implements sq,qb,sqr{
    public static void main(String[] args) {
        int m;
        m=sq.getsq(10);
        System.out.println("m="+m);
        m=qb.getqb(10);
        System.out.println("m="+m);
        double n;
        n=sqr.getsqr(100);
        System.out.println("n="+n);

    }
}
