import java.util.Scanner;
public class even
 {
    public static void main(String[]args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        //using for loop
    // for(int i=1; i<=n; i++)
    // {
    //       if(i%2==0)
    //      {
    //         System.out.println(i);
    //      }
          
    // }

    //using while loop
    int i=1;
    while(i<=n)
    {
       if(i%2==0)
       {
         System.out.println(i);
       }
       i++;
    }
    }
}
