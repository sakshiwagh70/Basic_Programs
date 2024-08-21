import java.util.Scanner;
public class maxarray 
{
    int a[];
    int n;
    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
       int n =sc.nextInt();
       System.out.println("enter array element");
         for(int i=0 ; i<n; i++)
         {
            a[i]=sc.nextInt();
         }
    }
    void findmax()
    {
        int max=a[0];
        for(int i=0; i<n; i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println("max element:"+max);
    }
    public static void main(String[]args)
    {
        maxarray m =new maxarray();
        m.accept();
        m.findmax();
    }
}
