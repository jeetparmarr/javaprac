import java.util.Scanner;
class p23
{
    public static void main(String ar[])
    {
        int x,y;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter x=");
        x=sc.nextInt();
        System.out.print("Enter y=");
        y=sc.nextInt();
        try
        {
            int p=x/y;
            System.out.println("p="+p);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error msg="+e);
        }
    }
}