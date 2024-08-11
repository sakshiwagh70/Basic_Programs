import java.util.Scanner;
public class thiskeyword
{
    int eid;
    String ename;
    void accept(int eid, String ename)
    {
        this.eid=eid;//this keyword
        this.ename=ename;
    }
    void display()
    {
        System.out.println(eid+ " "+ename);
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
         System.out.println("enter eid:");
         int eid=sc.nextInt();
         System.out.println("enter ename:");
         String ename=sc.next();
         thiskeyword e=new thiskeyword();
         e.accept(eid,ename);
         e.display();
    }
}
