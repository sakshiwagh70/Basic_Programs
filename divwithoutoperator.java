import java.util.Scanner;
public class divwithoutoperator
 {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number:");
        int n1=sc.nextInt();
        System.out.println("enter second number:");
        int n2=sc.nextInt();
        int div=0;
        int remainder=n1;
        for(int a=1; remainder>=n2 ; a++)
        {
            remainder= remainder-n2;
            div++;
        }
        System.out.println("division is:" +div);
    }
}
