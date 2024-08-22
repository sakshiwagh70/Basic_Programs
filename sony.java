import java.util.Scanner;
 abstract class abstractpc 
{
    public abstract void display();
}
public class sony extends abstractpc
{
    public void display()
    {
        System.out.println("sony data");
    }
}

 class HP extends abstractpc
{
    public void display()
    {
        System.out.println("HP data");
    }
}
 class dell extends abstractpc
{
    public void display()
    {
        System.out.println("dell data");
    }

public static void main(String[]args)
{
    Scanner sc=new Scanner(System.in);
    abstractpc p1;
    System.out.println("\n 1) sony \n2) HP \n2) dell");
    int ch =sc.nextInt();
    switch(ch)
    {
        case 1:
        p1= new sony();
        p1.display();
        break;
        case 2:
        p1= new HP();
        p1.display();
        break;
        case 3:
        p1= new dell();
        p1.display();
        break;

    }
}
}