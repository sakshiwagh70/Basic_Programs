import java.util.Scanner;
public class circle 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter radius:");
        int radius =sc.nextInt();
        double area= 3.14*radius*radius;
        System.out.println("area of circle:"+area+ "radius:"+radius);
    }
}
