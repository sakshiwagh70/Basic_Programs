import java.util.Scanner;
public class bank
 {
    double amount=5000;
    void deposite(int amt)
    {
        this.amount=amount+amt;
    }
    void withdraw(int amt)
    {
        this.amount=amount-amt;
    }
    void totalbalance()
    {
        System.out.println(amount);
    }
    public static void main(String[]args)
    {
        bank b=new bank();
       b.deposite(500);
        System.out.println(b.amount);
       b.withdraw(1000);
        System.out.println(b.amount);
       // b.totalbalance();


    }

}
