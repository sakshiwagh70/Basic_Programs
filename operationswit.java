import java.util.Scanner;

public class operationswit
 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int n1 = sc.nextInt();
        System.out.println("Enter number 2:");
        int n2 = sc.nextInt();
        System.out.println("Choose an operation: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        int op = sc.nextInt();
        switch (op) {
            case 1:System.out.println(n1 + n2);
                break;
            case 2:System.out.println(n1 - n2);
                break;
            case 3:System.out.println(n1 * n2);
                break;
            default:System.out.println("Invalid operation choice.");
        }
    }
}
