 import java.util.Scanner;
 abstract class shape 
{
    float area;
    public abstract void calarea();
    public void display()
    {
        System.out.println("area ="+area);
    }
}
public class circle extends shape
{
    float r;
    public circle(float r)
    {
        this.r=r;
    }
    public void calarea()
    {
        area=3.14f*r*r;
    }
}
class rectangle extends shape
{
    float l,b;
    public rectangle(float l,float b)
    {
        this.l=l;
        this.b=b;
    }
    public void calarea()
    {
        area=l*b;
    }
    public static void main(String[]args)
    {
        shape s1;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n 1)area of circle \n 2)area of rectangle");
        System.out.println("enter the choice");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            s1=new circle(4.4f);
            s1.calarea();
            s1.display();
            break;
            case 2:
            s1=new rectangle(4.4f,2.2f);
            s1.calarea();
            s1.display();
            break;
            
        }
    }
}