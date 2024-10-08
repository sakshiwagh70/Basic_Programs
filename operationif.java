import java.util.Scanner;
public class operationif 
{
   public static void main(String[]args)
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter num1:");
    int num1=sc.nextInt();
    System.out.println("enter num1:");
    int num2=sc.nextInt();
    System.out.println("enter operation:");
    System.out.println("enter 1 additon operation:");
    System.out.println("enter 2 substraction operation:");
    System.out.println("enter 3 multiplication operation:");
    int op=sc.nextInt();
    if(op==1)
    {
        System.out.println(num1+num2);
    }
   else if(op==2)
    {
        System.out.println(num1-num2);
    }
    else if(op==3)
    {
        System.out.println(num1*num2);
    }
    else
    {
        System.out.println("invalid");
    }
   }
}
