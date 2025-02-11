import java.util.*;
class P2
{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num1,num2,num3;
    System.out.print("Enter num1:");
    num1=sc.nextInt();
    System.out.print("Enter num2:");
    num2=sc.nextInt();
    System.out.print("Enter num3:");
    num3=sc.nextInt();
    if (num1>num2 && num1>num3)
    {
        System.out.print("num1 is big:");
    }
    else if (num2>num1 && num2>num3) {
        System.out.print("num2 is big:");
    }
    else{
        System.out.print("num3 is big:");
    }
    }
}