import java.util.Scanner;
public class primeno 
{
    public static void main(String[]args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter number");
       int n=sc.nextInt();
       boolean flag=true;
       for (int i = 2; i <=n; i++) 
       {
       if(n % 2 ==0)
       {
        flag=false;
        break;
       }
    }
       if(flag==true)
       {
           System.out.println("prime");
       }
     else
      {
       System.out.println(" not prime");
      }
    }
    
}

