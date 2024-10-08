import java.util.Scanner;
public class months 
{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter choice: ");
        System.out.println("1");
        System.out.println("2 ");
        System.out.println("3");

        int op = sc.nextInt();
        switch (op) {
            case 1:System.out.println("jan");
                break;
            case 2:System.out.println("feb");
                break;
            case 3:System.out.println("march");
                break;
            default:System.out.println("Invalid operation choice.");
        }
    }
}


