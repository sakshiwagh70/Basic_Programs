import java.util.Scanner;
public class withoutusingoperator 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number:");
        int n1=sc.nextInt();
        System.out.println("enter second number:");
        int n2=sc.nextInt();
        int mul=0;
        for(int a=1; a<=n2; a++)
        {
            mul=mul+n1;
        }
        System.out.println("multiplication is:"+mul);
        
    }
}
