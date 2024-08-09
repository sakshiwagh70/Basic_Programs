import java.util.Scanner;
public class Nnumberaddition 
{
     public static void main(String[]args)
    {
        int a=1,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        while(a<=n)
        {
            sum=sum+a;
            a++;
        }
        System.out.println("addition:"+sum);  
    }
}
