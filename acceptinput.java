import java.util.Scanner;
public class acceptinput
 {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name:");
        String name=sc.next();
        System.out.println("enter Roll no:");
        int rollno=sc.nextInt();
        System.out.println("rollno=" +rollno+ "\n name="+name);
    }
}
